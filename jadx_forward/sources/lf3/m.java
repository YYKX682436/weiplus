package lf3;

/* loaded from: classes14.dex */
public abstract class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f399860d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f399861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.ArrayList<lf3.p> arrayList = new java.util.ArrayList();
        this.f399860d = arrayList;
        this.f399861e = new java.util.HashSet();
        W6();
        for (lf3.p pVar : arrayList) {
            pVar.getClass();
            pf5.z.f435481a.a(activity).a(pVar.f399862a);
            this.f399861e.add((lf3.o) pf5.z.f435481a.a(activity).a(pVar.f399862a));
        }
    }

    public final java.util.List T6() {
        return new java.util.ArrayList(this.f399861e);
    }

    public final void U6(int i17, java.lang.Class clz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clz, "clz");
        this.f399860d.add(new lf3.p(clz, i17));
    }

    public final void V6(java.lang.Class clz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clz, "clz");
        this.f399860d.add(new lf3.p(clz, 0));
    }

    public abstract void W6();

    public final void X6(lf3.m mVar, int i17, f06.d implKClz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implKClz, "implKClz");
        mVar.U6(i17, xz5.a.b(implKClz));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2273x9d4787cb(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2274xbdc3c5dc()) {
                return true;
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2275x62f76871(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onBeforeFinishAfterTransition */
    public void mo72291x8d1ceba0() {
        super.mo72291x8d1ceba0();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo72291x8d1ceba0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2276x50e1c15d(newConfig);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo739xfd763ae1(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2277xb2f1ab1a(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo451xac79a11b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onEnterAnimationComplete */
    public void mo53055x51d329a4() {
        super.mo53055x51d329a4();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo53055x51d329a4();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo13982x7cf2e371();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onInterceptFinish */
    public boolean mo63118xdd2ad016() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo63118xdd2ad016()) {
                return true;
            }
        }
        return super.mo63118xdd2ad016();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2278x1f03f0c2(i17, event)) {
                return true;
            }
        }
        return super.mo2278x1f03f0c2(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2279xafd962bb(i17, event)) {
                return true;
            }
        }
        return super.mo2279xafd962bb(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2280xc944513d(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2281xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPostDestroyed */
    public void mo47481x6449b5ba() {
        super.mo47481x6449b5ba();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47481x6449b5ba();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47482x6fa9d635();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2282x953457f1(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
        super.mo2283xb949e58d(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2283xb949e58d(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2284x57429eec();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        super.mo2285xa71a2260(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2285xa71a2260(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2286xb05099c3();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.mo14640xb30cf874(intent, i17, bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo14640xb30cf874(intent, i17, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2287xc39f8281();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58275xd317978f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58437xaa858cb6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        for (lf3.p pVar : this.f399860d) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            lf3.o oVar = (lf3.o) pf5.z.f435481a.a(activity).a(pVar.f399862a);
            if (oVar.T6() != 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
                int T6 = oVar.T6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                if (T6 != 0) {
                    android.view.LayoutInflater.from(activity2).inflate(T6, (android.view.ViewGroup) contentView.findViewById(pVar.f399863b));
                }
            }
        }
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47092x594b1124(contentView);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo14961xa4ec7b0b(z17);
        }
    }
}
