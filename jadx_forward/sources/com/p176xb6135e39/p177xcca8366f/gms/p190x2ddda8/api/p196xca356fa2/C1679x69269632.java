package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInAccount */
/* loaded from: classes13.dex */
public class C1679x69269632 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632> f5658x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.zab();
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee zaa = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1995xe17b2a6d.m18555x9cf0d20b();
    final int zab;
    final java.util.List zac;
    private final java.lang.String zad;
    private final java.lang.String zae;
    private final java.lang.String zaf;
    private final java.lang.String zag;
    private final android.net.Uri zah;
    private java.lang.String zai;
    private final long zaj;
    private final java.lang.String zak;
    private final java.lang.String zal;
    private final java.lang.String zam;
    private final java.util.Set zan = new java.util.HashSet();

    public C1679x69269632(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j17, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
        this.zab = i17;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j17;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    /* renamed from: createDefault */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17480xe1faf9a5() {
        return zae(new android.accounts.Account("<<default account>>", "com.google"), new java.util.HashSet());
    }

    /* renamed from: fromAccount */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17481xbd6bf723(android.accounts.Account account) {
        return zae(account, new x.d(0));
    }

    /* renamed from: fromAccountAndScopes */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17482xf27e7573(android.accounts.Account account, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(account);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1762x4c04e34);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(c1762x4c04e34);
        hashSet.addAll(java.util.Arrays.asList(c1762x4c04e34Arr));
        return zae(account, hashSet);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 zaa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, java.lang.Long l17, java.lang.String str7, java.util.Set set) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632(3, str, str2, str3, str4, uri, null, l17.longValue(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str7), new java.util.ArrayList((java.util.Collection) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(set)), str5, str6);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 zab(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("photoUrl");
        android.net.Uri parse = !android.text.TextUtils.isEmpty(optString) ? android.net.Uri.parse(optString) : null;
        long parseLong = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            hashSet.add(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34(jSONArray.getString(i17)));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 zaa2 = zaa(jSONObject.optString(dm.i4.f66865x76d1ec5a), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c) ? jSONObject.optString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, java.lang.Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        zaa2.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return zaa2;
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 zae(android.accounts.Account account, java.util.Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    /* renamed from: equals */
    public boolean m17483xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632) obj;
        return c1679x69269632.zak.equals(this.zak) && c1679x69269632.m17493xb3e81777().equals(m17493xb3e81777());
    }

    /* renamed from: getAccount */
    public android.accounts.Account m17484xf7a0c5f7() {
        java.lang.String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new android.accounts.Account(str, "com.google");
    }

    /* renamed from: getDisplayName */
    public java.lang.String m17485x40021d37() {
        return this.zag;
    }

    /* renamed from: getEmail */
    public java.lang.String m17486x745ff1e6() {
        return this.zaf;
    }

    /* renamed from: getFamilyName */
    public java.lang.String m17487x1dd9b005() {
        return this.zam;
    }

    /* renamed from: getGivenName */
    public java.lang.String m17488x56fd50f2() {
        return this.zal;
    }

    /* renamed from: getGrantedScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m17489xeb7af384() {
        return new java.util.HashSet(this.zac);
    }

    /* renamed from: getId */
    public java.lang.String m17490x5db1b11() {
        return this.zad;
    }

    /* renamed from: getIdToken */
    public java.lang.String m17491x9fb3f168() {
        return this.zae;
    }

    /* renamed from: getPhotoUrl */
    public android.net.Uri m17492x2fe64753() {
        return this.zah;
    }

    /* renamed from: getRequestedScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m17493xb3e81777() {
        java.util.HashSet hashSet = new java.util.HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    /* renamed from: getServerAuthCode */
    public java.lang.String m17494x4e15590e() {
        return this.zai;
    }

    /* renamed from: hashCode */
    public int m17495x8cdac1b() {
        return ((this.zak.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + m17493xb3e81777().hashCode();
    }

    /* renamed from: isExpired */
    public boolean m17496x8f67ee9b() {
        return zaa.mo18536x5cbba1cc() / 1000 >= this.zaj + (-300);
    }

    /* renamed from: requestExtraScopes */
    public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17497x706096c0(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        if (c1762x4c04e34Arr != null) {
            java.util.Collections.addAll(this.zan, c1762x4c04e34Arr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zab);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, m17490x5db1b11(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, m17491x9fb3f168(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, m17486x745ff1e6(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 5, m17485x40021d37(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 6, m17492x2fe64753(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, m17494x4e15590e(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 8, this.zaj);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 9, this.zak, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 10, this.zac, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 11, m17488x56fd50f2(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 12, m17487x1dd9b005(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zac() {
        return this.zak;
    }

    public final java.lang.String zad() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (m17490x5db1b11() != null) {
                jSONObject.put(dm.i4.f66865x76d1ec5a, m17490x5db1b11());
            }
            if (m17491x9fb3f168() != null) {
                jSONObject.put("tokenId", m17491x9fb3f168());
            }
            if (m17486x745ff1e6() != null) {
                jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, m17486x745ff1e6());
            }
            if (m17485x40021d37() != null) {
                jSONObject.put("displayName", m17485x40021d37());
            }
            if (m17488x56fd50f2() != null) {
                jSONObject.put("givenName", m17488x56fd50f2());
            }
            if (m17487x1dd9b005() != null) {
                jSONObject.put("familyName", m17487x1dd9b005());
            }
            android.net.Uri m17492x2fe64753 = m17492x2fe64753();
            if (m17492x2fe64753 != null) {
                jSONObject.put("photoUrl", m17492x2fe64753.toString());
            }
            if (m17494x4e15590e() != null) {
                jSONObject.put("serverAuthCode", m17494x4e15590e());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List list = this.zac;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] c1762x4c04e34Arr = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[]) list.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[list.size()]);
            java.util.Arrays.sort(c1762x4c04e34Arr, new java.util.Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632> creator = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632.f5658x681a0c0c;
                    return ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) obj).m17842x5ecdbbee().compareTo(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) obj2).m17842x5ecdbbee());
                }
            });
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34 : c1762x4c04e34Arr) {
                jSONArray.put(c1762x4c04e34.m17842x5ecdbbee());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
