package i33;

/* loaded from: classes10.dex */
public final class r1 extends i33.d implements i33.n1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f369774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369774d = jz5.h.b(new i33.q1(this));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x004d. Please report as an issue. */
    public java.lang.String T6(android.content.Context context, int i17, int i18, int i19, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        boolean n17 = j33.d0.n();
        if (i17 != 4) {
            if (i17 != 11) {
                if (i17 != 19 && i17 != 22) {
                    if (i17 != 39) {
                        if (i17 != 43) {
                            if (i17 != 45) {
                                if (i17 == 48) {
                                    return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
                                }
                                if (i17 != 7) {
                                    if (i17 != 8) {
                                        if (i17 != 28) {
                                            if (i17 != 29) {
                                                if (i17 != 33) {
                                                    if (i17 != 34 && i17 != 36) {
                                                        if (i17 != 37) {
                                                            switch (i17) {
                                                                case 13:
                                                                case 14:
                                                                    break;
                                                                default:
                                                                    switch (i17) {
                                                                        case 24:
                                                                            break;
                                                                        case 25:
                                                                        case 26:
                                                                            break;
                                                                        default:
                                                                            if (i18 == 0 || i19 <= 1) {
                                                                                return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
                                                                            }
                                                                            java.lang.String string = z17 ? m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fis, java.lang.Integer.valueOf(i18)) : m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fiu, java.lang.Integer.valueOf(i18));
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                                                                            return string;
                                                                    }
                                                                case 15:
                                                                case 16:
                                                                    if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "album_business_bubble_media_by_coordinate")) || t23.p0.k().f496830f == 25) {
                                                                        if (i18 == 0 || i19 <= 1) {
                                                                            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
                                                                        }
                                                                        return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + '(' + i18 + ")";
                                                                    }
                                                                    if (i18 != 0 || i19 <= 1) {
                                                                        return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                                                                    }
                                                                    return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + '(' + i18 + ")";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        }
                        if (i18 != 0) {
                        }
                        return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                    }
                    return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                }
            }
            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572650c02);
        }
        if (n17 && j33.d0.j(arrayList, true)) {
            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573718fj3) + '(' + i18 + ")";
        }
        if (i18 == 0 || i19 <= 1) {
            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
        }
        return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + '(' + i18 + ")";
    }

    @Override // i33.n1
    public android.widget.TextView Y2() {
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.f369774d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(button, "<get-btnConfirm>(...)");
        return button;
    }
}
