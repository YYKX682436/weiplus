package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8;

/* renamed from: com.tencent.mm.plugin.textstatus.proto.ClusterShowInfo */
/* loaded from: classes8.dex */
public class C18605x13648145 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: iconActions */
    public java.util.LinkedList<pj4.g0> f38489x949a5a44 = new java.util.LinkedList<>();

    /* renamed from: iconId */
    public java.lang.String f38490xb8d40b74;

    /* renamed from: sourceActivityId */
    public java.lang.String f38491x643a9305;

    /* renamed from: sourceIcon */
    public java.lang.String f38492xbdbb9334;

    /* renamed from: sourceId */
    public java.lang.String f38493x6816d696;

    /* renamed from: sourceName */
    public java.lang.String f38494xbdbdd146;

    /* renamed from: topic */
    public java.lang.String f38495x696cd2f;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71700xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 c18605x13648145 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145) fVar;
        return n51.f.a(this.f38494xbdbdd146, c18605x13648145.f38494xbdbdd146) && n51.f.a(this.f38492xbdbb9334, c18605x13648145.f38492xbdbb9334) && n51.f.a(this.f38490xb8d40b74, c18605x13648145.f38490xb8d40b74) && n51.f.a(this.f38495x696cd2f, c18605x13648145.f38495x696cd2f) && n51.f.a(this.f38493x6816d696, c18605x13648145.f38493x6816d696) && n51.f.a(this.f38491x643a9305, c18605x13648145.f38491x643a9305) && n51.f.a(this.f38489x949a5a44, c18605x13648145.f38489x949a5a44);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f38494xbdbdd146;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f38492xbdbb9334;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f38490xb8d40b74;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f38495x696cd2f;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f38493x6816d696;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f38491x643a9305;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(8, 8, this.f38489x949a5a44);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f38494xbdbdd146;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f38492xbdbb9334;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f38490xb8d40b74;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f38495x696cd2f;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f38493x6816d696;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f38491x643a9305;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.g(8, 8, this.f38489x949a5a44);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f38489x949a5a44.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 c18605x13648145 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c18605x13648145.f38494xbdbdd146 = aVar2.k(intValue);
                return 0;
            case 2:
                c18605x13648145.f38492xbdbb9334 = aVar2.k(intValue);
                return 0;
            case 3:
                c18605x13648145.f38490xb8d40b74 = aVar2.k(intValue);
                return 0;
            case 4:
                c18605x13648145.f38495x696cd2f = aVar2.k(intValue);
                return 0;
            case 5:
                c18605x13648145.f38493x6816d696 = aVar2.k(intValue);
                return 0;
            case 6:
                c18605x13648145.f38491x643a9305 = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    pj4.g0 g0Var = new pj4.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var.mo11468x92b714fd(bArr2);
                    }
                    c18605x13648145.f38489x949a5a44.add(g0Var);
                }
                return 0;
        }
    }

    /* renamed from: setIconActions */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71701x4d61482(java.util.LinkedList<pj4.g0> linkedList) {
        this.f38489x949a5a44 = linkedList;
        return this;
    }

    /* renamed from: setIconId */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71702x11206276(java.lang.String str) {
        this.f38490xb8d40b74 = str;
        return this;
    }

    /* renamed from: setSourceActivityId */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71703xb00f8f87(java.lang.String str) {
        this.f38491x643a9305 = str;
        return this;
    }

    /* renamed from: setSourceIcon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71704xda209936(java.lang.String str) {
        this.f38492xbdbb9334 = str;
        return this;
    }

    /* renamed from: setSourceId */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71705xdea97518(java.lang.String str) {
        this.f38493x6816d696 = str;
        return this;
    }

    /* renamed from: setSourceName */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71706xda22d748(java.lang.String str) {
        this.f38494xbdbdd146 = str;
        return this;
    }

    /* renamed from: setTopic */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2272x65fc9e8.C18605x13648145 m71707x53c28ded(java.lang.String str) {
        this.f38495x696cd2f = str;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f38494xbdbdd146;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "sourceName", str, false);
            eVar.d(jSONObject, "sourceIcon", this.f38492xbdbb9334, false);
            eVar.d(jSONObject, "iconId", this.f38490xb8d40b74, false);
            eVar.d(jSONObject, "topic", this.f38495x696cd2f, false);
            eVar.d(jSONObject, "sourceId", this.f38493x6816d696, false);
            eVar.d(jSONObject, "sourceActivityId", this.f38491x643a9305, false);
            eVar.d(jSONObject, "iconActions", this.f38489x949a5a44, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
