package c3;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c3.b f38084a;

    public a(android.content.Context context, android.content.pm.ShortcutInfo shortcutInfo) {
        java.lang.String string;
        c3.b bVar = new c3.b();
        this.f38084a = bVar;
        bVar.f38085a = shortcutInfo.getId();
        shortcutInfo.getPackage();
        android.content.Intent[] intents = shortcutInfo.getIntents();
        bVar.f38086b = (android.content.Intent[]) java.util.Arrays.copyOf(intents, intents.length);
        shortcutInfo.getActivity();
        bVar.f38087c = shortcutInfo.getShortLabel();
        bVar.f38088d = shortcutInfo.getLongLabel();
        shortcutInfo.getDisabledMessage();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        shortcutInfo.getCategories();
        android.os.PersistableBundle extras = shortcutInfo.getExtras();
        if (extras != null && extras.containsKey("extraPersonCount")) {
            int i17 = extras.getInt("extraPersonCount");
            z2.r1[] r1VarArr = new z2.r1[i17];
            int i18 = 0;
            while (i18 < i17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("extraPerson_");
                int i19 = i18 + 1;
                sb6.append(i19);
                r1VarArr[i18] = z2.o1.a(extras.getPersistableBundle(sb6.toString()));
                i18 = i19;
            }
        }
        c3.b bVar2 = this.f38084a;
        shortcutInfo.getUserHandle();
        bVar2.getClass();
        c3.b bVar3 = this.f38084a;
        shortcutInfo.getLastChangedTimestamp();
        bVar3.getClass();
        int i27 = android.os.Build.VERSION.SDK_INT;
        if (i27 >= 30) {
            c3.b bVar4 = this.f38084a;
            shortcutInfo.isCached();
            bVar4.getClass();
        }
        c3.b bVar5 = this.f38084a;
        shortcutInfo.isDynamic();
        bVar5.getClass();
        c3.b bVar6 = this.f38084a;
        shortcutInfo.isPinned();
        bVar6.getClass();
        c3.b bVar7 = this.f38084a;
        shortcutInfo.isDeclaredInManifest();
        bVar7.getClass();
        c3.b bVar8 = this.f38084a;
        shortcutInfo.isImmutable();
        bVar8.getClass();
        c3.b bVar9 = this.f38084a;
        shortcutInfo.isEnabled();
        bVar9.getClass();
        c3.b bVar10 = this.f38084a;
        shortcutInfo.hasKeyFieldsOnly();
        bVar10.getClass();
        c3.b bVar11 = this.f38084a;
        if (i27 < 29) {
            android.os.PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                if (android.text.TextUtils.isEmpty(string)) {
                    throw new java.lang.IllegalArgumentException("id cannot be empty");
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    new android.content.LocusId(string);
                }
            }
        } else if (shortcutInfo.getLocusId() != null) {
            android.content.LocusId locusId = shortcutInfo.getLocusId();
            m3.h.d(locusId, "locusId cannot be null");
            java.lang.String id6 = locusId.getId();
            if (android.text.TextUtils.isEmpty(id6)) {
                throw new java.lang.IllegalArgumentException("id cannot be empty");
            }
            if (android.text.TextUtils.isEmpty(id6)) {
                throw new java.lang.IllegalArgumentException("id cannot be empty");
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                new android.content.LocusId(id6);
            }
        }
        bVar11.getClass();
        c3.b bVar12 = this.f38084a;
        shortcutInfo.getRank();
        bVar12.getClass();
        c3.b bVar13 = this.f38084a;
        shortcutInfo.getExtras();
        bVar13.getClass();
    }
}
