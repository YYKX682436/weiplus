package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class xb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.yb f166952a;

    public xb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.yb ybVar) {
        this.f166952a = ybVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z8
    /* renamed from: invoke */
    public boolean mo51849xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8[] v8VarArr = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8.ATTRS_NOT_FOUND, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8.VERSION_NOT_FOUND};
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.yb ybVar = this.f166952a;
        boolean z17 = false;
        if (u46.a.b(v8VarArr, ybVar.f166976d.C)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8 v8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8.INVALID_FIELDS;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar = ybVar.f166976d;
        boolean z18 = v8Var == vbVar.C;
        if (!android.text.TextUtils.isEmpty(vbVar.f166816i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar2 = ybVar.f166976d;
            java.lang.String str = vbVar2.f166816i;
            return !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.l(str, z18, false, vbVar2.f166820p != null ? r1.f68922x6a92a081 : 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.vb vbVar3 = ybVar.f166976d;
        java.lang.String str2 = vbVar3.f166817m;
        k91.v5 v5Var = vbVar3.f166820p;
        long j17 = v5Var != null ? v5Var.f68922x6a92a081 : 0L;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaAttrSyncHelper", "needUpdateAttrByAppId(%s), storage NULL", str2);
        } else {
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            long g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.g(z18, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            if (i17 - j17 >= g17 || j17 > i17 + g17) {
                z17 = true;
            }
        }
        return !z17;
    }
}
