package gf2;

/* loaded from: classes2.dex */
public final class a0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f352791d;

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof android.view.View) {
            container.removeView((android.view.View) obj);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.ArrayList arrayList = this.f352791d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        java.util.ArrayList arrayList = this.f352791d;
        if (arrayList == null) {
            return -2;
        }
        if (kz5.n0.O(arrayList, obj instanceof android.view.View ? (android.view.View) obj : null)) {
            return arrayList.indexOf(obj);
        }
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.util.ArrayList arrayList = this.f352791d;
        if (arrayList != null) {
            boolean z17 = false;
            if (i17 >= 0 && i17 < arrayList.size()) {
                z17 = true;
            }
            if (z17) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                android.view.View view = (android.view.View) obj;
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                container.addView(view);
                return view;
            }
        }
        android.widget.TextView textView = new android.widget.TextView(container.getContext());
        textView.setText("Invalid position: " + i17);
        container.addView(textView);
        return textView;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return view == obj;
    }
}
