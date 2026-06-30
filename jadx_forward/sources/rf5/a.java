package rf5;

/* loaded from: classes15.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f476665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f476665d = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2273x9d4787cb(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).mo2274xbdc3c5dc()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2275x62f76871(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2276x50e1c15d(newConfig);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo739xfd763ae1(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2277xb2f1ab1a(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo451xac79a11b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).mo2278x1f03f0c2(i17, event)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).mo2279xafd962bb(i17, event)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2280xc944513d(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2281xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2282x953457f1(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2283xb949e58d(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2284x57429eec();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2285xa71a2260(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2286xb05099c3();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f476665d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).mo2287xc39f8281();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f476665d = new java.util.HashMap();
    }
}
