package p12;

/* loaded from: classes10.dex */
public class g extends p12.h {

    /* renamed from: i, reason: collision with root package name */
    public static final p12.f f432552i = new p12.f(null);

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd f432553g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f432554h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f previewLayout) {
        super(activity, previewLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewLayout, "previewLayout");
        this.f432553g = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd(activity, null);
    }

    @Override // p12.h
    public android.view.View a() {
        return this.f432553g;
    }

    @Override // p12.h
    public void b() {
    }

    @Override // p12.h
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return d(this.f432555a.getIntent().getStringExtra("media_path"), interfaceC29045xdcb5ca57);
    }

    public java.lang.Object d(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhotoRenderViewController", "media path is null");
            return null;
        }
        try {
            this.f432560f = new java.io.File(str);
            android.graphics.Bitmap a17 = p12.f.a(f432552i, str, 0, 0, 6, null);
            if (a17 == null) {
                return null;
            }
            this.f432554h = a17;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f432558d).k(new android.util.Size(a17.getWidth(), a17.getHeight()));
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c0085xa15044fd = this.f432553g;
            c0085xa15044fd.setImageBitmap(a17);
            c0085xa15044fd.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            this.f432556b.addView(c0085xa15044fd, new android.view.ViewGroup.LayoutParams(-2, -2));
            return l12.a.f396514f;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhotoRenderViewController", "failed to setup photo render. " + th6);
            return null;
        }
    }
}
