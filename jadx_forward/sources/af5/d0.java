package af5;

/* loaded from: classes9.dex */
public final class d0 implements af5.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final em.r f86095a;

    public d0(em.r binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f86095a = binding;
    }

    public android.widget.TextView a() {
        em.r rVar = this.f86095a;
        if (rVar.f336273h == null) {
            rVar.f336273h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) rVar.f336266a.findViewById(com.p314xaae8f345.mm.R.id.ucm);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = rVar.f336273h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22632xdab56332, "getLocationDetail(...)");
        return c22632xdab56332;
    }

    public android.widget.ImageView b() {
        em.r rVar = this.f86095a;
        if (rVar.f336274i == null) {
            rVar.f336274i = (android.widget.ImageView) rVar.f336266a.findViewById(com.p314xaae8f345.mm.R.id.ucp);
        }
        android.widget.ImageView imageView = rVar.f336274i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getLocationMapImage(...)");
        return imageView;
    }

    public android.widget.TextView c() {
        em.r rVar = this.f86095a;
        if (rVar.f336267b == null) {
            rVar.f336267b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) rVar.f336266a.findViewById(com.p314xaae8f345.mm.R.id.uct);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = rVar.f336267b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22632xdab56332, "getLocationName(...)");
        return c22632xdab56332;
    }
}
