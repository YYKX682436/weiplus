package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions */
/* loaded from: classes13.dex */
public class C1682x64d992a3 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.Optional, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3> f5667x681a0c0c;

    /* renamed from: DEFAULT_GAMES_SIGN_IN */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 f5668xfaed79ab;

    /* renamed from: DEFAULT_SIGN_IN */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 f5669xbb03bac9;
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 zab = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c);
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 zac = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330);
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 zad;
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 zae;
    private static final java.util.Comparator zag;
    final int zaf;
    private final java.util.ArrayList zah;
    private android.accounts.Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private java.lang.String zam;
    private java.lang.String zan;
    private java.util.ArrayList zao;
    private java.lang.String zap;
    private java.util.Map zaq;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {
        private java.util.Set zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        private java.lang.String zae;
        private android.accounts.Account zaf;
        private java.lang.String zag;
        private java.util.Map zah;
        private java.lang.String zai;

        public Builder() {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
        }

        private final java.lang.String zaa(java.lang.String str) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
            java.lang.String str2 = this.zae;
            boolean z17 = true;
            if (str2 != null && !str2.equals(str)) {
                z17 = false;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(z17, "two different server client ids provided");
            return str;
        }

        /* renamed from: addExtension */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17522xd344e89e(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
            if (this.zah.containsKey(java.lang.Integer.valueOf(interfaceC1683xbf7cf0dc.m17534x208ea463()))) {
                throw new java.lang.IllegalStateException("Only one extension per type may be added");
            }
            java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m17535x13eb97b1 = interfaceC1683xbf7cf0dc.m17535x13eb97b1();
            if (m17535x13eb97b1 != null) {
                this.zaa.addAll(m17535x13eb97b1);
            }
            this.zah.put(java.lang.Integer.valueOf(interfaceC1683xbf7cf0dc.m17534x208ea463()), new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1688xdf43d2df(interfaceC1683xbf7cf0dc));
            return this;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 m17523x59bc66e() {
            if (this.zaa.contains(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zae)) {
                java.util.Set set = this.zaa;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zad;
                if (set.contains(c1762x4c04e34)) {
                    this.zaa.remove(c1762x4c04e34);
                }
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                m17525x295c940a();
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3(new java.util.ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        /* renamed from: requestEmail */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17524x4c3caa4d() {
            this.zaa.add(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zab);
            return this;
        }

        /* renamed from: requestId */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17525x295c940a() {
            this.zaa.add(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zac);
            return this;
        }

        /* renamed from: requestIdToken */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17526xf3442c0f(java.lang.String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        /* renamed from: requestProfile */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17527x7eec001a() {
            this.zaa.add(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zaa);
            return this;
        }

        /* renamed from: requestScopes */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17528x52b6040e(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
            this.zaa.add(c1762x4c04e34);
            this.zaa.addAll(java.util.Arrays.asList(c1762x4c04e34Arr));
            return this;
        }

        /* renamed from: requestServerAuthCode */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17529xa0942487(java.lang.String str) {
            m17530xa0942487(str, false);
            return this;
        }

        /* renamed from: setAccountName */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17531xa3d95496(java.lang.String str) {
            this.zaf = new android.accounts.Account(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str), "com.google");
            return this;
        }

        /* renamed from: setHostedDomain */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17532x52aef56d(java.lang.String str) {
            this.zag = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
            return this;
        }

        /* renamed from: setLogSessionId */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17533x4a8fb4ef(java.lang.String str) {
            this.zai = str;
            return this;
        }

        /* renamed from: requestServerAuthCode */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder m17530xa0942487(java.lang.String str, boolean z17) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z17;
            return this;
        }

        public Builder(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1682x64d992a3);
            this.zaa = new java.util.HashSet(c1682x64d992a3.zah);
            this.zab = c1682x64d992a3.zak;
            this.zac = c1682x64d992a3.zal;
            this.zad = c1682x64d992a3.zaj;
            this.zae = c1682x64d992a3.zam;
            this.zaf = c1682x64d992a3.zai;
            this.zag = c1682x64d992a3.zan;
            this.zah = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.zam(c1682x64d992a3.zao);
            this.zai = c1682x64d992a3.zap;
        }
    }

    static {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5854x7987a38c);
        zad = c1762x4c04e34;
        zae = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5853x4073aa1);
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder builder = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder();
        builder.m17525x295c940a();
        builder.m17527x7eec001a();
        f5669xbb03bac9 = builder.m17523x59bc66e();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder builder2 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder();
        builder2.m17528x52b6040e(c1762x4c04e34, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[0]);
        f5668xfaed79ab = builder2.m17523x59bc66e();
        f5667x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.zae();
        zag = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.zac();
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 zab(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            hashSet.add(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(jSONArray.getString(i17)));
        }
        java.lang.String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3(3, new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(optString) ? new android.accounts.Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), (java.lang.String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map zam(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1688xdf43d2df c1688xdf43d2df = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1688xdf43d2df) it.next();
                hashMap.put(java.lang.Integer.valueOf(c1688xdf43d2df.m17544xfb85f7b0()), c1688xdf43d2df);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.m17512xf7a0c5f7()) != false) goto L22;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m17511xb2c87fbf(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.zao     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.zao     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m17516x2efbaf95()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m17516x2efbaf95()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m17512xf7a0c5f7()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m17512xf7a0c5f7()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m17517x2ee3a39f()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m17517x2ee3a39f()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m17519xaf012ff9()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m17520x5de030ba()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m17521x9500e1ac()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m17514x1446b9e3()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.m17511xb2c87fbf(java.lang.Object):boolean");
    }

    /* renamed from: getAccount */
    public android.accounts.Account m17512xf7a0c5f7() {
        return this.zai;
    }

    /* renamed from: getExtensions */
    public java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1688xdf43d2df> m17513x8267240a() {
        return this.zao;
    }

    /* renamed from: getLogSessionId */
    public java.lang.String m17514x1446b9e3() {
        return this.zap;
    }

    /* renamed from: getScopeArray */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] m17515xe134d05b() {
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[]) this.zah.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[this.zah.size()]);
    }

    /* renamed from: getScopes */
    public java.util.ArrayList<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m17516x2efbaf95() {
        return new java.util.ArrayList<>(this.zah);
    }

    /* renamed from: getServerClientId */
    public java.lang.String m17517x2ee3a39f() {
        return this.zam;
    }

    /* renamed from: hashCode */
    public int m17518x8cdac1b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) arrayList2.get(i17)).m17842x5ecdbbee());
        }
        java.util.Collections.sort(arrayList);
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1689x8a6cf278 c1689x8a6cf278 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1689x8a6cf278();
        c1689x8a6cf278.m17545xf8384b40(arrayList);
        c1689x8a6cf278.m17545xf8384b40(this.zai);
        c1689x8a6cf278.m17545xf8384b40(this.zam);
        c1689x8a6cf278.zaa(this.zal);
        c1689x8a6cf278.zaa(this.zaj);
        c1689x8a6cf278.zaa(this.zak);
        c1689x8a6cf278.m17545xf8384b40(this.zap);
        return c1689x8a6cf278.m17546x30c10e();
    }

    /* renamed from: isForceCodeForRefreshToken */
    public boolean m17519xaf012ff9() {
        return this.zal;
    }

    /* renamed from: isIdTokenRequested */
    public boolean m17520x5de030ba() {
        return this.zaj;
    }

    /* renamed from: isServerAuthCodeRequested */
    public boolean m17521x9500e1ac() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaf;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 2, m17516x2efbaf95(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, m17512xf7a0c5f7(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 4, m17520x5de030ba());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, m17521x9500e1ac());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 6, m17519xaf012ff9());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, m17517x2ee3a39f(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 8, this.zan, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 9, m17513x8267240a(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 10, m17514x1446b9e3(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zaf() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.zah, zag);
            java.util.Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) it.next()).m17842x5ecdbbee());
            }
            jSONObject.put("scopes", jSONArray);
            android.accounts.Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!android.text.TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!android.text.TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public C1682x64d992a3(int i17, java.util.ArrayList arrayList, android.accounts.Account account, boolean z17, boolean z18, boolean z19, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList2, java.lang.String str3) {
        this(i17, arrayList, account, z17, z18, z19, str, str2, zam(arrayList2), str3);
    }

    private C1682x64d992a3(int i17, java.util.ArrayList arrayList, android.accounts.Account account, boolean z17, boolean z18, boolean z19, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3) {
        this.zaf = i17;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z17;
        this.zak = z18;
        this.zal = z19;
        this.zam = str;
        this.zan = str2;
        this.zao = new java.util.ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
