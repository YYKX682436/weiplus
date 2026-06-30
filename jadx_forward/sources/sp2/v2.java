package sp2;

/* loaded from: classes2.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(sp2.d3 d3Var) {
        super(1);
        this.f492776d = d3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        sp2.d3 d3Var = this.f492776d;
        az2.f fVar = d3Var.f492548i;
        if (fVar != null) {
            fVar.b();
        }
        d3Var.f492548i = null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d3Var.f492540a;
            db5.t7.g(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ops));
        } else {
            linkedList.size();
            d3Var.c(linkedList);
        }
        return jz5.f0.f384359a;
    }
}
