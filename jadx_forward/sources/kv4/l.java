package kv4;

/* loaded from: classes12.dex */
public final class l implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f394241a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f394242b;

    public l(mv4.a boxData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        this.f394241a = boxData;
        this.f394242b = jv4.m.f383785r;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        kv4.i iVar = holder instanceof kv4.i ? (kv4.i) holder : null;
        if (iVar == null) {
            return;
        }
        kv4.k kVar = new kv4.k(this);
        java.lang.Object mo141623x754a37bb = ((jz5.n) ((qv4.b) iVar).f448491d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        kVar.mo146xb9724478((android.view.View) mo141623x754a37bb);
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f394242b;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "ai-search-" + ((rv4.a) this.f394241a).f481958b;
    }

    @Override // nv4.g
    public void w() {
        java.util.Iterator it = ((rv4.a) this.f394241a).f481957a.iterator();
        while (it.hasNext()) {
            ((rv4.b) ((mv4.b) it.next())).w();
        }
    }
}
