package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.m {

    /* renamed from: a, reason: collision with root package name */
    public int f168997a;

    /* renamed from: b, reason: collision with root package name */
    public int f168998b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f168999c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i f169000d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.e eVar) {
        this.f169000d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.m
    public void a(int i17, int i18) {
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar = this.f169000d;
        java.lang.String str = iVar.f169004a;
        if (iVar.f169012i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169000d.f169004a, "onStablePositionChange, onVideoPositionGot, released");
            return;
        }
        int mo129531x8d5c7601 = this.f169000d.f169009f.mo129531x8d5c7601();
        if (mo129531x8d5c7601 == 0) {
            mo129531x8d5c7601 = -1;
        }
        int mo129530x463504c = this.f169000d.f169009f.mo129530x463504c();
        if (mo129530x463504c == 0) {
            mo129530x463504c = -1;
        }
        int i28 = this.f169000d.f169008e.i();
        int k17 = this.f169000d.f169008e.k();
        if (this.f168999c == null) {
            this.f168999c = this.f169000d.b();
        }
        android.graphics.Point point = this.f168999c;
        if (point == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169000d.f169004a, "MyOnStablePositionChangeListener, null == mWebView2PipContainerParentOffset");
            return;
        }
        int i29 = this.f168997a;
        int i37 = this.f168998b + point.y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169000d.f169004a, "MyOnStablePositionChangeListener, originVideoPosX: %d, originVideoPosY: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i iVar2 = this.f169000d;
        iVar2.getClass();
        boolean z17 = true;
        boolean z18 = (-1 == mo129531x8d5c7601 || -1 == mo129530x463504c) ? false : true;
        if (!z18 ? i28 < k17 : mo129531x8d5c7601 < mo129530x463504c) {
            z17 = false;
        }
        if (z17) {
            iVar2.f169028y = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.K;
            iVar2.f169029z = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.L;
            i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.M;
            i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.N;
        } else {
            iVar2.f169028y = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.P;
            iVar2.f169029z = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.Q;
            i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.R;
            i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.S;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = iVar2.f169006c;
        int m53321x34b63a55 = c12753x672cc895.m53321x34b63a55();
        int m53322x34b63a56 = c12753x672cc895.m53322x34b63a56();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(m53321x34b63a55), java.lang.Integer.valueOf(m53322x34b63a56)};
        java.lang.String str2 = iVar2.f169004a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "calculateStablePipContainerSizeAndPosition, stablePosX: %d, stablePosY: %d", objArr);
        iVar2.A = java.lang.Math.min(java.lang.Math.max(0, m53321x34b63a55), iVar2.f169013j - iVar2.f169028y);
        iVar2.B = java.lang.Math.min(java.lang.Math.max(0, m53322x34b63a56), iVar2.f169014k - iVar2.f169029z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "calculateStablePipContainerSizeAndPosition, mEndPipContainerPosX: %d, mEndPipContainerPosY: %d", java.lang.Integer.valueOf(iVar2.A), java.lang.Integer.valueOf(iVar2.B));
        if (!z18) {
            mo129531x8d5c7601 = i28;
            mo129530x463504c = k17;
        }
        if ((i19 + 0.0f) / mo129531x8d5c7601 >= (i27 + 0.0f) / mo129530x463504c) {
            iVar2.C = i19;
            iVar2.D = (int) java.lang.Math.ceil(r0 * r3);
        } else {
            iVar2.C = (int) java.lang.Math.ceil(r12 * r1);
            iVar2.D = i27;
        }
        iVar2.f169020q = i28;
        iVar2.f169021r = k17;
        float f17 = iVar2.f169029z;
        int i38 = (int) (((f17 + 0.0f) / iVar2.D) * k17);
        iVar2.f169017n = i38;
        float f18 = iVar2.f169028y;
        int i39 = (int) (((f18 + 0.0f) / iVar2.C) * i28);
        iVar2.f169016m = i39;
        iVar2.C = i19;
        iVar2.D = i27;
        float f19 = (i39 + 0.0f) / f18;
        float f27 = (i38 + 0.0f) / f17;
        int min = java.lang.Math.min(java.lang.Math.max(i29, -i39), iVar2.f169013j);
        int min2 = java.lang.Math.min(java.lang.Math.max(i37, -iVar2.f169017n), iVar2.f169014k);
        if (z18) {
            iVar2.f169018o = min - ((int) ((f19 * (iVar2.f169028y - i19)) / 2.0f));
            iVar2.f169019p = min2 - ((int) (((iVar2.f169029z - i27) * f27) / 2.0f));
        } else {
            int i47 = iVar2.f169020q;
            iVar2.f169018o = (min + ((i28 - i47) / 2)) - ((iVar2.f169016m - i47) / 2);
            int i48 = iVar2.f169021r;
            iVar2.f169019p = (min2 + ((k17 - i48) / 2)) - ((iVar2.f169017n - i48) / 2);
        }
        iVar2.f169022s = (int) java.lang.Math.ceil((iVar2.f169016m - iVar2.f169020q) * 0.5f);
        iVar2.f169023t = (int) java.lang.Math.ceil((iVar2.f169017n - iVar2.f169021r) * 0.4f);
        iVar2.f169024u = (int) java.lang.Math.ceil((iVar2.f169017n - iVar2.f169021r) * 0.6f);
        iVar2.f169025v = (int) (iVar2.H * f27);
        iVar2.f169026w = (int) (iVar2.I * f27);
        iVar2.f169027x = (int) (f27 * iVar2.f169003J);
    }
}
