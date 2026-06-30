package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class v3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public boolean C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var, pl1.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        if (e4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition failed, EditText is null");
            return false;
        }
        int m53464xb251d24f = e4Var.m53464xb251d24f();
        java.lang.ref.WeakReference weakReference = this.f173143o;
        if (weakReference == null || (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(m53464xb251d24f));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35 = v5Var.mo51311x3eebbc35();
        if (mo51311x3eebbc35 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(m53464xb251d24f));
            return false;
        }
        java.lang.Boolean bool = fVar.f438139t;
        boolean w17 = mo51311x3eebbc35.w(m53464xb251d24f, new float[]{fVar.f438124e.intValue(), fVar.f438123d.intValue(), fVar.f438121b.intValue(), fVar.f438122c.intValue(), 0}, (bool == null || !bool.booleanValue()) ? 0 : 4, fVar.f438143x, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) success = %s", java.lang.Integer.valueOf(m53464xb251d24f), java.lang.Boolean.valueOf(w17));
        return w17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public boolean k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var, pl1.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        if (e4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl failed, EditText is null");
            return false;
        }
        int i17 = fVar.Q;
        java.lang.ref.WeakReference weakReference = this.f173143o;
        if (weakReference == null || (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35 = v5Var.mo51311x3eebbc35();
        if (mo51311x3eebbc35 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.Boolean bool = fVar.f438139t;
        int i18 = (bool == null || !bool.booleanValue()) ? 0 : 4;
        int i19 = fVar.P;
        float[] fArr = {fVar.f438124e.intValue(), fVar.f438123d.intValue(), fVar.f438121b.intValue(), fVar.f438122c.intValue(), 0};
        java.lang.Boolean bool2 = fVar.f438143x;
        boolean e17 = mo51311x3eebbc35.e(e4Var, i17, i19, fArr, i18, bool2 != null && bool2.booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) success = %s, ", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e17));
        return e17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 o() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0
    public void z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var) {
        if (e4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl failed, EditText is null");
            return;
        }
        int m53464xb251d24f = e4Var.m53464xb251d24f();
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f173138g;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f172945i).m174754xc84af884(onFocusChangeListener);
        }
        java.lang.ref.WeakReference weakReference = this.f173143o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = weakReference == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(m53464xb251d24f));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35 = v5Var.mo51311x3eebbc35();
        if (mo51311x3eebbc35 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(m53464xb251d24f));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) success = %s", java.lang.Integer.valueOf(m53464xb251d24f), java.lang.Boolean.valueOf(mo51311x3eebbc35.r(m53464xb251d24f)));
        }
    }
}
