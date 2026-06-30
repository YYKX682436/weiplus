package o12;

/* loaded from: classes10.dex */
public final class x extends o12.y {

    /* renamed from: a, reason: collision with root package name */
    public static final o12.x f423727a = new o12.x();

    public x() {
        super(null);
    }

    @Override // o12.y
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13257xd7c65e84 editText, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        editText.m54740x630fd73d(0);
        editText.setTextColor(i17);
        float a17 = ym5.x.a(editText.getContext(), 4.0f);
        int i18 = -1;
        if (i17 != -16777216) {
            if (i17 != -1) {
                i18 = android.graphics.Color.argb(android.graphics.Color.alpha(i17), (int) (android.graphics.Color.red(i17) * 0.5f), (int) (android.graphics.Color.green(i17) * 0.5f), (int) (android.graphics.Color.blue(i17) * 0.5f));
            } else {
                i18 = -16777216;
            }
        }
        editText.f179010i = a17;
        editText.f179011m = i18;
    }

    @Override // o12.y
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f79928x9fcd4640;
    }
}
