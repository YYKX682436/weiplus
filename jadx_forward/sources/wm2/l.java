package wm2;

/* loaded from: classes14.dex */
public final class l implements xm2.a {

    /* renamed from: a, reason: collision with root package name */
    public final wm2.n f528781a;

    public l(wm2.n widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f528781a = widget;
    }

    public void a() {
        wm2.n nVar = this.f528781a;
        java.util.List list = nVar.f528790g;
        android.widget.FrameLayout frameLayout = nVar.f528788e;
        android.widget.FrameLayout frameLayout2 = nVar.f528789f;
        if (list.size() == 1) {
            return;
        }
        bn2.p pVar = (bn2.p) kz5.n0.i0(list);
        ((java.util.ArrayList) list).remove(list.size() - 1);
        int size = list.size();
        bn2.p pVar2 = (bn2.p) kz5.n0.i0(list);
        pVar2.e().setAlpha(0.0f);
        frameLayout.addView(pVar2.e());
        pVar2.e().animate().setDuration(300L).alpha(1.0f).start();
        pVar.e().animate().setDuration(300L).alpha(0.0f).translationX(frameLayout.getWidth()).withEndAction(new wm2.f(frameLayout, pVar)).start();
        if (size == 1) {
            nVar.f528786c.animate().setDuration(150L).alpha(0.0f);
            nVar.f528787d.animate().setDuration(150L).alpha(0.0f);
            nVar.f528785b.animate().setStartDelay(150L).setDuration(150L).alpha(1.0f);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.a(), pVar2.a())) {
            android.view.ViewGroup a17 = pVar2.a();
            if (a17 != null) {
                a17.setAlpha(0.0f);
                frameLayout2.addView(a17);
                a17.animate().setStartDelay(150L).setDuration(150L).alpha(1.0f).start();
            }
            android.view.ViewGroup a18 = pVar.a();
            if (a18 != null) {
                a18.animate().setDuration(150L).alpha(0.0f).withEndAction(new wm2.g(frameLayout2, pVar)).start();
            }
        }
        pVar.h();
        pVar2.f();
    }

    public void b(bn2.p provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        wm2.n nVar = this.f528781a;
        java.util.List list = nVar.f528790g;
        android.widget.FrameLayout frameLayout = nVar.f528788e;
        android.widget.FrameLayout frameLayout2 = nVar.f528789f;
        provider.g(this);
        int size = list.size();
        bn2.p pVar = (bn2.p) kz5.n0.i0(list);
        ((java.util.ArrayList) list).add(provider);
        provider.e().setAlpha(0.0f);
        provider.e().setTranslationX(frameLayout.getWidth());
        frameLayout.addView(provider.e());
        provider.e().animate().setDuration(300L).alpha(1.0f).translationX(0.0f).start();
        pVar.e().animate().setDuration(300L).alpha(0.0f).withEndAction(new wm2.h(frameLayout, pVar)).start();
        if (size == 1) {
            nVar.f528785b.animate().setDuration(150L).alpha(0.0f);
            nVar.f528786c.animate().setStartDelay(150L).setDuration(150L).alpha(1.0f);
            if (provider.c()) {
                nVar.f528787d.animate().setStartDelay(150L).setDuration(150L).alpha(1.0f);
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.a(), provider.a())) {
            android.view.ViewGroup a17 = provider.a();
            if (a17 != null) {
                a17.setAlpha(0.0f);
                frameLayout2.addView(a17);
                a17.animate().setStartDelay(150L).setDuration(150L).alpha(1.0f).start();
            }
            android.view.ViewGroup a18 = pVar.a();
            if (a18 != null) {
                a18.animate().setDuration(150L).alpha(0.0f).withEndAction(new wm2.i(frameLayout2, pVar)).start();
            }
        }
        provider.d();
        provider.f();
    }

    public void c(bn2.p provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        wm2.n nVar = this.f528781a;
        java.util.List list = nVar.f528790g;
        android.widget.FrameLayout frameLayout = nVar.f528788e;
        android.widget.FrameLayout frameLayout2 = nVar.f528789f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        provider.g(this);
        bn2.p pVar = (bn2.p) kz5.n0.i0(arrayList);
        arrayList.remove(arrayList.size() - 1);
        arrayList.add(provider);
        provider.e().setAlpha(0.0f);
        frameLayout.addView(provider.e());
        provider.e().animate().setStartDelay(150L).setDuration(150L).alpha(1.0f).start();
        pVar.e().animate().setDuration(150L).alpha(0.0f).withEndAction(new wm2.j(frameLayout, pVar)).start();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.a(), provider.a())) {
            android.view.ViewGroup a17 = provider.a();
            if (a17 != null) {
                a17.setAlpha(0.0f);
                frameLayout2.addView(a17);
                a17.animate().setDuration(150L).alpha(1.0f).start();
            }
            android.view.ViewGroup a18 = pVar.a();
            if (a18 != null) {
                a18.animate().setStartDelay(150L).setDuration(150L).alpha(0.0f).withEndAction(new wm2.k(frameLayout2, pVar)).start();
            }
        }
        pVar.h();
        provider.d();
        provider.f();
    }
}
