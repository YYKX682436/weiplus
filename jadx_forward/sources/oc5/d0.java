package oc5;

/* loaded from: classes12.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f425930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(oc5.g0 g0Var) {
        super(0);
        this.f425930d = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oc5.g0 g0Var = this.f425930d;
        java.util.HashMap hashMap = g0Var.f425953d;
        java.util.Set keySet = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            oc5.t tVar = (oc5.t) hashMap.get((java.lang.String) it.next());
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1 c5226x932022f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1();
            am.q1 q1Var = c5226x932022f1.f135559g;
            q1Var.getClass();
            q1Var.f89219a = tVar != null ? tVar.f426006a : 0L;
            c5226x932022f1.e();
        }
        hashMap.clear();
        g0Var.f425954e.clear();
        g0Var.f425955f.clear();
        return jz5.f0.f384359a;
    }
}
