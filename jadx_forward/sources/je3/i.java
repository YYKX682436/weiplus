package je3;

/* loaded from: classes7.dex */
public interface i extends i95.m {
    static /* synthetic */ void La(je3.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c, long j17, java.util.List list, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performanceReport");
        }
        iVar.qa(str, str2, str3, enumC16454xc40f4d3c, j17, (i17 & 32) != 0 ? null : list, (i17 & 64) != 0 ? null : jSONObject);
    }

    static /* synthetic */ void M2(je3.i iVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72 enumC16456x617fbd72, long j17, java.lang.String str3, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timeCostReport");
        }
        iVar.t6(str, str2, enumC16456x617fbd72, j17, (i17 & 16) != 0 ? "" : str3, (i17 & 32) != 0 ? 1.0f : f17);
    }

    /* renamed from: if */
    static /* synthetic */ void m180102if(je3.i iVar, java.lang.String str, int i17, long j17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446 enumC16451x1796f446, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e enumC16450xc9b86c3e, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 enumC16449xa1a30c86, int i18, int i19, java.lang.String str3, java.lang.String str4, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: magicClickReport");
        }
        iVar.vb(str, (i27 & 2) != 0 ? 0 : i17, j17, str2, enumC16451x1796f446, enumC16450xc9b86c3e, enumC16449xa1a30c86, (i27 & 128) != 0 ? 0 : i18, (i27 & 256) != 0 ? 0 : i19, (i27 & 512) != 0 ? "" : str3, (i27 & 1024) != 0 ? "" : str4);
    }

    static /* synthetic */ void t8(je3.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runtimeReport");
        }
        if ((i17 & 8) != 0) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        if ((i17 & 16) != 0) {
            f17 = 0.01f;
        }
        iVar.T5(str, str2, str3, str5, f17);
    }

    static /* synthetic */ void x2(je3.i iVar, java.lang.String str, int i17, java.lang.String str2, float f17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: kvReport");
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        if ((i18 & 8) != 0) {
            f17 = 0.01f;
        }
        iVar.Sc(str, i17, str2, f17);
    }

    boolean Ii(float f17);

    boolean Nb();

    void Rg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed enumC16453x290f8fed, int i18, int i19);

    void Sc(java.lang.String str, int i17, java.lang.String str2, float f17);

    void T5(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f17);

    boolean W7();

    void qa(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c, long j17, java.util.List list, org.json.JSONObject jSONObject);

    void t6(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72 enumC16456x617fbd72, long j17, java.lang.String str3, float f17);

    void vb(java.lang.String str, int i17, long j17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446 enumC16451x1796f446, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e enumC16450xc9b86c3e, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 enumC16449xa1a30c86, int i18, int i19, java.lang.String str3, java.lang.String str4);
}
