package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel */
/* loaded from: classes15.dex */
public class C28675xdb64c7c6 {
    private static final java.lang.String TAG = "TextInputChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71511x2c0b7d03;

    /* renamed from: parsingMethodHandler */
    final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71512xf115c659;

    /* renamed from: textInputMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler f71513x684ccf8c;

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration */
    /* loaded from: classes15.dex */
    public static class Configuration {

        /* renamed from: actionLabel */
        public final java.lang.String f71515x5d51825e;

        /* renamed from: autocorrect */
        public final boolean f71516x82cbd7db;

        /* renamed from: autofill */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill f71517x55c963b2;

        /* renamed from: contentCommitMimeTypes */
        public final java.lang.String[] f71518x17af0b75;

        /* renamed from: enableDeltaModel */
        public final boolean f71519x52fd1c34;

        /* renamed from: enableIMEPersonalizedLearning */
        public final boolean f71520x1cfb2b6c;

        /* renamed from: enableSuggestions */
        public final boolean f71521xf398796c;

        /* renamed from: fields */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] f71522xb4057eb9;

        /* renamed from: hintLocales */
        public final java.util.Locale[] f71523xeddc60d2;

        /* renamed from: inputAction */
        public final java.lang.Integer f71524xce1d42a0;

        /* renamed from: inputType */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType f71525x65be6624;

        /* renamed from: obscureText */
        public final boolean f71526xcf9191f2;

        /* renamed from: textCapitalization */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization f71527x7f811c89;

        /* renamed from: wxInputConfiguration */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration f71528x8719fa0d;

        /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration$Autofill */
        /* loaded from: classes15.dex */
        public static class Autofill {

            /* renamed from: editState */
            public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState f71529x901d9ca7;

            /* renamed from: hintText */
            public final java.lang.String f71530xa827fc54;

            /* renamed from: hints */
            public final java.lang.String[] f71531x5eaf2cc;

            /* renamed from: uniqueIdentifier */
            public final java.lang.String f71532xf885435a;

            public Autofill(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState) {
                this.f71532xf885435a = str;
                this.f71531x5eaf2cc = strArr;
                this.f71530xa827fc54 = str2;
                this.f71529x901d9ca7 = textEditState;
            }

            /* renamed from: fromJson */
            public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill m138372xb5cb93b2(org.json.JSONObject jSONObject) {
                java.lang.String string = jSONObject.getString("uniqueIdentifier");
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("hints");
                java.lang.String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    strArr[i17] = m138373xf3e54dc7(jSONArray.getString(i17));
                }
                return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill(string, strArr, string2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState.m138381xb5cb93b2(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /* renamed from: translateAutofillHint */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String m138373xf3e54dc7(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill.m138373xf3e54dc7(java.lang.String):java.lang.String");
            }
        }

        public Configuration(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization textCapitalization, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType inputType, java.lang.Integer num, java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill, java.lang.String[] strArr, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration wxInputConfiguration, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] configurationArr, java.util.Locale[] localeArr) {
            this.f71526xcf9191f2 = z17;
            this.f71516x82cbd7db = z18;
            this.f71521xf398796c = z19;
            this.f71520x1cfb2b6c = z27;
            this.f71519x52fd1c34 = z28;
            this.f71527x7f811c89 = textCapitalization;
            this.f71525x65be6624 = inputType;
            this.f71524xce1d42a0 = num;
            this.f71515x5d51825e = str;
            this.f71517x55c963b2 = autofill;
            this.f71518x17af0b75 = strArr;
            this.f71528x8719fa0d = wxInputConfiguration;
            this.f71522xb4057eb9 = configurationArr;
            this.f71523xeddc60d2 = localeArr;
        }

        /* renamed from: fromJson */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration m138370xb5cb93b2(org.json.JSONObject jSONObject) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] configurationArr;
            java.util.Locale[] localeArr;
            java.lang.String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new org.json.JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] configurationArr2 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[length];
                for (int i17 = 0; i17 < length; i17++) {
                    configurationArr2[i17] = m138370xb5cb93b2(jSONArray.getJSONObject(i17));
                }
                configurationArr = configurationArr2;
            }
            java.lang.Integer m138371x176def69 = m138371x176def69(string);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    arrayList.add(jSONArray2.optString(i18));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                java.util.Locale[] localeArr2 = new java.util.Locale[jSONArray3.length()];
                for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                    localeArr2[i19] = java.util.Locale.forLanguageTag(jSONArray3.optString(i19));
                }
                localeArr = localeArr2;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TAG, "Received '" + jSONObject.getJSONObject("wxInputConfiguration").toString() + "' message.");
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization.m138377x447c3e7(jSONObject.getString("textCapitalization")), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType.m138374xb5cb93b2(jSONObject.getJSONObject("inputType")), m138371x176def69, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill.m138372xb5cb93b2(jSONObject.getJSONObject("autofill")), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), jSONObject.isNull("wxInputConfiguration") ? null : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration.m138389xb5cb93b2(jSONObject.getJSONObject("wxInputConfiguration")), configurationArr, localeArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /* renamed from: inputActionFromTextInputAction */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer m138371x176def69(java.lang.String r12) {
            /*
                r12.getClass()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = r11
                goto L80
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L80
            L2b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r7 = r1
                goto L80
            L36:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r7 = r2
                goto L80
            L41:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r7 = r3
                goto L80
            L4c:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r7 = r4
                goto L80
            L57:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r7 = r5
                goto L80
            L62:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r7 = r6
                goto L80
            L6d:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r7 = r9
            L80:
                switch(r7) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r10
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L89:
                return r8
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L99:
                return r8
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La4:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.m138371x176def69(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$InputType */
    /* loaded from: classes15.dex */
    public static class InputType {

        /* renamed from: isDecimal */
        public final boolean f71533x395e5ac7;

        /* renamed from: isSigned */
        public final boolean f71534xf26260e6;

        /* renamed from: type */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType f71535x368f3a;

        public InputType(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType textInputType, boolean z17, boolean z18) {
            this.f71535x368f3a = textInputType;
            this.f71534xf26260e6 = z17;
            this.f71533x395e5ac7 = z18;
        }

        /* renamed from: fromJson */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType m138374xb5cb93b2(org.json.JSONObject jSONObject) {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.m138386x447c3e7(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization */
    /* loaded from: classes15.dex */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: encodedName */
        private final java.lang.String f71541x72d13cb9;

        TextCapitalization(java.lang.String str) {
            this.f71541x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization m138377x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization textCapitalization : m138379xcee59d22()) {
                if (textCapitalization.f71541x72d13cb9.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new java.lang.NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState */
    /* loaded from: classes15.dex */
    public static class TextEditState {

        /* renamed from: composingEnd */
        public final int f71542xf18c188c;

        /* renamed from: composingStart */
        public final int f71543xbfb02bd3;

        /* renamed from: selectionEnd */
        public final int f71544x9ee6a3af;

        /* renamed from: selectionStart */
        public final int f71545x80947a36;

        /* renamed from: text */
        public final java.lang.String f71546x36452d;

        public TextEditState(java.lang.String str, int i17, int i18, int i19, int i27) {
            if (!(i17 == -1 && i18 == -1) && (i17 < 0 || i18 < 0)) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection: (" + java.lang.String.valueOf(i17) + ", " + java.lang.String.valueOf(i18) + ")");
            }
            if (!(i19 == -1 && i27 == -1) && (i19 < 0 || i19 > i27)) {
                throw new java.lang.IndexOutOfBoundsException("invalid composing range: (" + java.lang.String.valueOf(i19) + ", " + java.lang.String.valueOf(i27) + ")");
            }
            if (i27 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid composing start: " + java.lang.String.valueOf(i19));
            }
            if (i17 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection start: " + java.lang.String.valueOf(i17));
            }
            if (i18 > str.length()) {
                throw new java.lang.IndexOutOfBoundsException("invalid selection end: " + java.lang.String.valueOf(i18));
            }
            this.f71546x36452d = str;
            this.f71545x80947a36 = i17;
            this.f71544x9ee6a3af = i18;
            this.f71543xbfb02bd3 = i19;
            this.f71542xf18c188c = i27;
        }

        /* renamed from: formJsonOnlySelection */
        public static java.util.Map<java.lang.String, java.lang.Integer> m138380xa64ba2d4(org.json.JSONObject jSONObject) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int optInt = jSONObject.optInt("selectionBase", 0);
            int optInt2 = jSONObject.optInt("selectionExtent", 0);
            hashMap.put("selectionBase", java.lang.Integer.valueOf(optInt));
            hashMap.put("selectionExtent", java.lang.Integer.valueOf(optInt2));
            io.p3284xd2ae381c.Log.d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TAG, "formJsonOnlySelection selectionBase: " + optInt + ", selectionExtent: " + optInt2);
            return hashMap;
        }

        /* renamed from: fromJson */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState m138381xb5cb93b2(org.json.JSONObject jSONObject) {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        /* renamed from: hasComposing */
        public boolean m138382x6bd44c55() {
            int i17 = this.f71543xbfb02bd3;
            return i17 >= 0 && this.f71542xf18c188c > i17;
        }

        /* renamed from: hasSelection */
        public boolean m138383x58fb4c12() {
            return this.f71545x80947a36 >= 0;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler */
    /* loaded from: classes15.dex */
    public interface TextInputMethodHandler {
        /* renamed from: clearClient */
        void mo44272x85bce878();

        /* renamed from: finishAutofillContext */
        void mo44273xda74508a(boolean z17);

        /* renamed from: hide */
        void mo44274x30dd42();

        /* renamed from: requestAutofill */
        void mo44275xf01abb61();

        /* renamed from: sendAppPrivateCommand */
        void mo44276x9a2d9221(java.lang.String str, android.os.Bundle bundle);

        /* renamed from: setClient */
        void mo44277x75f4acd(int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration);

        /* renamed from: setEditableSizeAndTransform */
        void mo44278x3608b2fc(double d17, double d18, double[] dArr);

        /* renamed from: setEditingState */
        void mo44279x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState);

        /* renamed from: setPlatformViewClient */
        void mo44280x9713fa5(int i17, boolean z17);

        /* renamed from: setTextSelectionState */
        void mo44281x484e5cf4(java.util.Map<java.lang.String, java.lang.Integer> map);

        /* renamed from: show */
        void mo44282x35dafd();
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType */
    /* loaded from: classes15.dex */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");


        /* renamed from: encodedName */
        private final java.lang.String f71560x72d13cb9;

        TextInputType(java.lang.String str) {
            this.f71560x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType m138386x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType textInputType : m138388xcee59d22()) {
                if (textInputType.f71560x72d13cb9.equals(str)) {
                    return textInputType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration */
    /* loaded from: classes7.dex */
    public static class WxInputConfiguration {

        /* renamed from: adjustPosition */
        public final boolean f71561x18b935d8;

        /* renamed from: confirmHold */
        public final boolean f71562x1481ef9f;

        /* renamed from: cursorSpacing */
        public final int f71563x42ed1c0d;

        /* renamed from: dartWidgetId */
        public final int f71564x1437471e;

        /* renamed from: elementTag */
        public final java.lang.String f71565x2253f6fe;

        /* renamed from: inputId */
        public final int f71566x74849685;

        /* renamed from: keyboardData */
        public final java.lang.String f71567xc6c8c31;

        /* renamed from: keyboardType */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType f71568xc742bc1;

        /* renamed from: showConfirmBar */
        public final boolean f71569x91398410;

        /* renamed from: showKeyBoardCoverView */
        public final boolean f71570xa0745978;

        /* renamed from: usePasswordMode */
        public final boolean f71571xcd2faa05;

        public WxInputConfiguration(int i17, int i18, java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType wxKeyboardType, int i19, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.lang.String str2) {
            this.f71566x74849685 = i17;
            this.f71564x1437471e = i18;
            this.f71565x2253f6fe = str;
            this.f71568xc742bc1 = wxKeyboardType;
            this.f71563x42ed1c0d = i19;
            this.f71569x91398410 = z17;
            this.f71571xcd2faa05 = z18;
            this.f71570xa0745978 = z19;
            this.f71562x1481ef9f = z27;
            this.f71561x18b935d8 = z28;
            this.f71567xc6c8c31 = str2;
        }

        /* renamed from: fromJson */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration m138389xb5cb93b2(org.json.JSONObject jSONObject) {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration(jSONObject.getInt("inputId"), jSONObject.getInt("dartWidgetId"), jSONObject.getString("elementTag"), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType.m138392x447c3e7(jSONObject.getString("keyboardType")), jSONObject.getInt("cursorSpacing"), jSONObject.optBoolean("showConfirmBar", false), jSONObject.optBoolean("usePasswordMode", false), jSONObject.optBoolean("showKeyBoardCoverView", false), jSONObject.optBoolean("confirmHold", false), jSONObject.optBoolean("adjustPosition", true), jSONObject.optString("keyboardData"));
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType */
    /* loaded from: classes7.dex */
    public enum WxKeyboardType {
        TEXT("WxKeyboardType.Text"),
        NUMBER("WxKeyboardType.Number"),
        DIGIT("WxKeyboardType.Digit"),
        IDCARD("WxKeyboardType.IDCard"),
        SAFEPASSWORD("WxKeyboardType.SafePassword"),
        CUSTOM("WxKeyboardType.Custom");


        /* renamed from: encodedName */
        private final java.lang.String f71579x72d13cb9;

        WxKeyboardType(java.lang.String str) {
            this.f71579x72d13cb9 = str;
        }

        /* renamed from: fromValue */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType m138392x447c3e7(java.lang.String str) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxKeyboardType wxKeyboardType : m138394xcee59d22()) {
                if (wxKeyboardType.f71579x72d13cb9.equals(str)) {
                    return wxKeyboardType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such WxKeyboardType: " + str);
        }
    }

    public C28675xdb64c7c6(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                android.os.Bundle bundle;
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c == null) {
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                java.lang.Object obj = c28687x4bb242ff.f71609x86ac7956;
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case -724389821:
                        if (str.equals("TextInput.setTextSelectionState")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c17 = 4;
                            break;
                        }
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c17 = 5;
                            break;
                        }
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c17 = 6;
                            break;
                        }
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c17 = 7;
                            break;
                        }
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c17 = '\b';
                            break;
                        }
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c17 = '\t';
                            break;
                        }
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c17 = '\n';
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        try {
                            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44280x9713fa5(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.mo65720x90b54003(null);
                            return;
                        } catch (org.json.JSONException e17) {
                            result.mo65718x5c4d208("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44279x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState.m138381xb5cb93b2((org.json.JSONObject) obj));
                            result.mo65720x90b54003(null);
                            return;
                        } catch (org.json.JSONException e18) {
                            result.mo65718x5c4d208("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44281x484e5cf4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState.m138380xa64ba2d4((org.json.JSONObject) obj));
                            result.mo65720x90b54003(null);
                            return;
                        } catch (org.json.JSONException e19) {
                            result.mo65718x5c4d208("error", e19.getMessage(), null);
                            return;
                        }
                    case 3:
                        try {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44277x75f4acd(jSONArray.getInt(0), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.m138370xb5cb93b2(jSONArray.getJSONObject(1)));
                            result.mo65720x90b54003(null);
                            return;
                        } catch (java.lang.NoSuchFieldException | org.json.JSONException e27) {
                            result.mo65718x5c4d208("error", e27.getMessage(), null);
                            return;
                        }
                    case 4:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44274x30dd42();
                        result.mo65720x90b54003(null);
                        return;
                    case 5:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44282x35dafd();
                        result.mo65720x90b54003(null);
                        return;
                    case 6:
                        try {
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                            java.lang.String string = jSONObject2.getString("action");
                            java.lang.String string2 = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new android.os.Bundle();
                                bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, string2);
                            }
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44276x9a2d9221(string, bundle);
                            result.mo65720x90b54003(null);
                            return;
                        } catch (org.json.JSONException e28) {
                            result.mo65718x5c4d208("error", e28.getMessage(), null);
                            return;
                        }
                    case 7:
                        try {
                            org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj;
                            double d17 = jSONObject3.getDouble("width");
                            double d18 = jSONObject3.getDouble("height");
                            org.json.JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i17 = 0; i17 < 16; i17++) {
                                dArr[i17] = jSONArray2.getDouble(i17);
                            }
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44278x3608b2fc(d17, d18, dArr);
                            result.mo65720x90b54003(null);
                            return;
                        } catch (org.json.JSONException e29) {
                            result.mo65718x5c4d208("error", e29.getMessage(), null);
                            return;
                        }
                    case '\b':
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44273xda74508a(((java.lang.Boolean) obj).booleanValue());
                        result.mo65720x90b54003(null);
                        return;
                    case '\t':
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44272x85bce878();
                        result.mo65720x90b54003(null);
                        return;
                    case '\n':
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.this.f71513x684ccf8c.mo44275xf01abb61();
                        result.mo65720x90b54003(null);
                        return;
                    default:
                        result.mo65719xbc9fa82f();
                        return;
                }
            }
        };
        this.f71512xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/textinput", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        this.f71511x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: createEditingDeltaJSON */
    private static java.util.HashMap<java.lang.Object, java.lang.Object> m138354x5af86704(java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> arrayList) {
        java.util.HashMap<java.lang.Object, java.lang.Object> hashMap = new java.util.HashMap<>();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m138521xcc313de3());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    /* renamed from: createEditingStateJSON */
    private static java.util.HashMap<java.lang.Object, java.lang.Object> m138355xdb805b5d(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.util.HashMap<java.lang.Object, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str);
        hashMap.put("selectionBase", java.lang.Integer.valueOf(i17));
        hashMap.put("selectionExtent", java.lang.Integer.valueOf(i18));
        hashMap.put("composingBase", java.lang.Integer.valueOf(i19));
        hashMap.put("composingExtent", java.lang.Integer.valueOf(i27));
        return hashMap;
    }

    /* renamed from: commitContent */
    public void m138356x79612742(int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'commitContent' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.commitContent", map));
    }

    /* renamed from: done */
    public void m138357x2f2382(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'done' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.done"));
    }

    public void go(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'go' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.go"));
    }

    /* renamed from: newline */
    public void m138358x6e068994(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'newline' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.newline"));
    }

    /* renamed from: next */
    public void m138359x338af3(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'next' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.next"));
    }

    /* renamed from: performPrivateCommand */
    public void m138360x68475e09(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof java.lang.Byte) {
                    hashMap2.put(str2, java.lang.Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof java.lang.Character) {
                    hashMap2.put(str2, java.lang.Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof java.lang.CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof java.lang.CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof java.lang.Float) {
                    hashMap2.put(str2, java.lang.Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, hashMap2);
        }
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performPrivateCommand", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), hashMap));
    }

    /* renamed from: previous */
    public void m138361xb413baf7(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'previous' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.previous"));
    }

    /* renamed from: requestExistingInputState */
    public void m138362x951f73c1() {
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.requestExistingInputState", null);
    }

    /* renamed from: search */
    public void m138363xc9fa65a8(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'search' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.search"));
    }

    /* renamed from: send */
    public void m138364x35cf88(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'send' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.send"));
    }

    /* renamed from: setTextInputMethodHandler */
    public void m138365x45ee28e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler textInputMethodHandler) {
        this.f71513x684ccf8c = textInputMethodHandler;
    }

    /* renamed from: unspecifiedAction */
    public void m138366x5dc9704d(int i17) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending 'unspecified' message.");
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), "TextInputAction.unspecified"));
    }

    /* renamed from: updateEditingState */
    public void m138367x64794542(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i18 + "\nSelection end: " + i19 + "\nComposing start: " + i27 + "\nComposing end: " + i28);
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.updateEditingState", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), m138355xdb805b5d(str, i18, i19, i27, i28)));
    }

    /* renamed from: updateEditingStateWithDeltas */
    public void m138368xc6c02303(int i17, java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> arrayList) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.updateEditingStateWithDeltas", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), m138354x5af86704(arrayList)));
    }

    /* renamed from: updateEditingStateWithTag */
    public void m138369x7e8add52(int i17, java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState> hashMap) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to update editing state for " + java.lang.String.valueOf(hashMap.size()) + " field(s).");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState> entry : hashMap.entrySet()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState value = entry.getValue();
            hashMap2.put(entry.getKey(), m138355xdb805b5d(value.f71546x36452d, value.f71545x80947a36, value.f71544x9ee6a3af, -1, -1));
        }
        this.f71511x2c0b7d03.m138438xd8c5c779("TextInputClient.updateEditingStateWithTag", java.util.Arrays.asList(java.lang.Integer.valueOf(i17), hashMap2));
    }
}
