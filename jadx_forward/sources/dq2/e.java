package dq2;

/* loaded from: classes2.dex */
public final class e extends hp2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List feedList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, int i17) {
        super(feedList, c22848x6ddd90cf, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
    }

    @Override // hp2.g
    public boolean i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 layoutManager, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        int i18 = i17 % 2;
        return i18 == 0 ? !(h(i17 + 1) instanceof so2.h1) : i18 == 1 ? !(h(i17 - 1) instanceof so2.h1) : super.i(layoutManager, i17);
    }
}
