package p03;

@j95.b
/* loaded from: classes.dex */
public final class e extends i95.w implements f50.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f431960d;

    public e() {
        p3325xe03a0797.p3326xc267989b.z0.b();
        this.f431960d = new java.util.LinkedList();
    }

    public void wi() {
        java.util.Iterator it = this.f431960d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.C24759xf854b319 c24759xf854b319 = ((q03.b) ((f50.b0) it.next())).f440898e;
            if (c24759xf854b319 != null) {
                c24759xf854b319.m91725xa9526b82(q03.a.f440896d);
            }
        }
    }
}
