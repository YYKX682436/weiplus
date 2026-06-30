package vm5;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public rm5.v f519690a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f519691b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 f519692c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 f519693d;

    /* renamed from: e, reason: collision with root package name */
    public vm5.a f519694e;

    /* renamed from: f, reason: collision with root package name */
    public int f519695f;

    /* renamed from: g, reason: collision with root package name */
    public int f519696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f519697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f519698i;

    /* renamed from: j, reason: collision with root package name */
    public vm5.c f519699j;

    public g(rm5.v composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f519690a = composition;
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 c17 = rm5.v.c(composition, false, 1, null);
        this.f519692c = c17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4(c17.m98593x742a913a());
        this.f519693d = c25841xf3b90db4;
        c25841xf3b90db4.m98148xfbd38eb1(this.f519692c.m98595x57d6f9a5());
        this.f519693d.m98136xb0bd9928(this.f519692c.m98594xb605381c());
        android.graphics.Bitmap bitmap = this.f519690a.f479119n;
        if (bitmap != null) {
            this.f519693d.m98140x361aa546(true, bitmap);
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db42 = this.f519693d;
        c25841xf3b90db42.m98139xe3d8bd28(this.f519690a.f479123r);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701(c25841xf3b90db42);
        this.f519691b = c25839x8ea38701;
        c25839x8ea38701.mo98041xeb18d027(this.f519690a.h());
        this.f519690a.getClass();
        this.f519697h = false;
        this.f519698i = false;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea387012 = this.f519691b;
        if (c25839x8ea387012 != null) {
            c25839x8ea387012.mo98042x2ccf87b7(new vm5.d(this));
        }
        xm5.b.c("VideoCompositionPlayer", "create player, composition:" + this.f519690a, new java.lang.Object[0]);
    }

    public final long a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98064x23d61fe6;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f519691b;
        return ((c25839x8ea38701 == null || (m98064x23d61fe6 = c25839x8ea38701.m98064x23d61fe6()) == null) ? 0L : m98064x23d61fe6.m97232x31040141()) / 1000;
    }

    public final void b(boolean z17) {
        xm5.b.c("VideoCompositionPlayer", "setLoop:" + z17, new java.lang.Object[0]);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f519691b;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98039x764cf626(z17);
        }
    }

    public final void c() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701;
        xm5.b.c("VideoCompositionPlayer", "start, isUpdatingComposition:" + this.f519698i, new java.lang.Object[0]);
        if (!this.f519698i && (c25839x8ea38701 = this.f519691b) != null) {
            c25839x8ea38701.mo98034x348b34();
        }
        this.f519697h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(rm5.v r17, boolean r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm5.g.d(rm5.v, boolean, boolean, long):void");
    }
}
