package yw3;

/* loaded from: classes4.dex */
public final class w3 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f548452d;

    public w3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f548452d = repairerMvvmDBDemoUI;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        yw3.v3 v3Var = new yw3.v3(this.f548452d);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event.f425120a, o75.b.f425118f)) {
            v3Var.mo146xb9724478(event);
            return;
        }
        java.util.HashMap hashMap = event.f425124e;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                v3Var.mo146xb9724478(((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }
}
