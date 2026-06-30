package hq5;

/* loaded from: classes5.dex */
public final class w extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f364814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364814d = jz5.h.b(new hq5.s(this));
    }

    public final android.widget.TextView T6() {
        return (android.widget.TextView) ((jz5.n) this.f364814d).mo141623x754a37bb();
    }

    public final java.lang.String U6() {
        java.lang.String str;
        eq5.h hVar;
        j75.f Q6 = Q6();
        long j17 = (Q6 == null || (hVar = (eq5.h) Q6.mo140437x75286adb()) == null) ? 0L : hVar.f337453n;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((j17 >> 30) > 0) {
            str = java.lang.String.format("%.2f GB", java.lang.Double.valueOf(j17 / 1.073741824E9d));
        } else if ((j17 >> 20) > 0) {
            str = java.lang.Math.round(j17 / 1048576.0d) + " MB";
        } else if ((j17 >> 9) > 0) {
            str = java.lang.Math.round(j17 / 1024.0d) + " KB";
        } else {
            str = j17 + " B";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getIntegerSize(...)");
        return str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.t(this));
        }
    }
}
