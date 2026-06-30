package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* renamed from: io.flutter.plugin.editing.SpellCheckPlugin */
/* loaded from: classes13.dex */
public class SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.SpellCheckMethodHandler, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: END_INDEX_KEY */
    public static final java.lang.String f71689x4b7b72ae = "endIndex";

    /* renamed from: MAX_SPELL_CHECK_SUGGESTIONS */
    private static final int f71690xaffe9c86 = 5;

    /* renamed from: START_INDEX_KEY */
    public static final java.lang.String f71691x3d6ab575 = "startIndex";

    /* renamed from: SUGGESTIONS_KEY */
    public static final java.lang.String f71692xe1655ccf = "suggestions";

    /* renamed from: mSpellCheckChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003 f71693x17a35736;

    /* renamed from: mSpellCheckerSession */
    private android.view.textservice.SpellCheckerSession f71694x8866dabc;

    /* renamed from: mTextServicesManager */
    private final android.view.textservice.TextServicesManager f71695xf852f2d5;

    /* renamed from: pendingResult */
    io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f71696x16857094;

    public SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33(android.view.textservice.TextServicesManager textServicesManager, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003 c28672x65861003) {
        this.f71695xf852f2d5 = textServicesManager;
        this.f71693x17a35736 = c28672x65861003;
        c28672x65861003.m138349xcce05787(this);
    }

    /* renamed from: destroy */
    public void m138510x5cd39ffa() {
        this.f71693x17a35736.m138349xcce05787(null);
        android.view.textservice.SpellCheckerSession spellCheckerSession = this.f71694x8866dabc;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28672x65861003.SpellCheckMethodHandler
    /* renamed from: initiateSpellCheck */
    public void mo138350xde4e3039(java.lang.String str, java.lang.String str2, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f71696x16857094 != null) {
            result.mo65718x5c4d208("error", "Previous spell check request still pending.", null);
        } else {
            this.f71696x16857094 = result;
            m138511xa3212b01(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f71696x16857094.mo65720x90b54003(new java.util.ArrayList());
            this.f71696x16857094 = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.textservice.SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f71696x16857094.mo65720x90b54003(new java.util.ArrayList());
            this.f71696x16857094 = null;
            return;
        }
        for (int i17 = 0; i17 < sentenceSuggestionsInfo.getSuggestionsCount(); i17++) {
            android.view.textservice.SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i17);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i17);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i17) + offsetAt;
                hashMap.put(f71691x3d6ab575, java.lang.Integer.valueOf(offsetAt));
                hashMap.put(f71689x4b7b72ae, java.lang.Integer.valueOf(lengthAt));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z17 = false;
                for (int i18 = 0; i18 < suggestionsCount; i18++) {
                    java.lang.String suggestionAt = suggestionsInfoAt.getSuggestionAt(i18);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z17 = true;
                    }
                }
                if (z17) {
                    hashMap.put(f71692xe1655ccf, arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f71696x16857094.mo65720x90b54003(arrayList);
        this.f71696x16857094 = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] suggestionsInfoArr) {
    }

    /* renamed from: performSpellCheck */
    public void m138511xa3212b01(java.lang.String str, java.lang.String str2) {
        java.util.Locale m138569xccb5be55 = io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.m138569xccb5be55(str);
        if (this.f71694x8866dabc == null) {
            this.f71694x8866dabc = this.f71695xf852f2d5.newSpellCheckerSession(null, m138569xccb5be55, this, true);
        }
        this.f71694x8866dabc.getSentenceSuggestions(new android.view.textservice.TextInfo[]{new android.view.textservice.TextInfo(str2)}, 5);
    }
}
