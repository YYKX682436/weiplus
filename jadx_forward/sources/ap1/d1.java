package ap1;

/* loaded from: classes5.dex */
public final class d1 extends ap1.i0 {

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f94171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // ap1.i0
    public java.lang.Object T6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list;
        ap1.c2 c2Var;
        java.util.HashSet hashSet;
        java.util.List list2 = this.f94171h;
        if (list2 != null) {
            if (list2 != null) {
                return list2;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contactList");
            throw null;
        }
        j75.f U6 = U6();
        if (U6 == null || (c2Var = (ap1.c2) U6.mo140437x75286adb()) == null || (hashSet = c2Var.f94163n) == null) {
            list = kz5.p0.f395529d;
        } else {
            list = new java.util.ArrayList();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                list.add(new ap1.a0((java.lang.String) it.next(), 0L, 0L));
            }
        }
        this.f94171h = list;
        return list;
    }

    @Override // ap1.i0, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
        abstractActivityC21394xb3d2c0cf.m78560xe21cbbf(false);
        abstractActivityC21394xb3d2c0cf.m78563x4e0f6657(false);
        abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        abstractActivityC21394xb3d2c0cf.m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int dimension = (int) m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.hwa);
        if (frameLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = dimension;
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.hvf);
        if (frameLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams2).height = dimension;
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            android.view.View j17 = mo2533x106ab264.j();
            android.widget.TextView textView = (android.widget.TextView) j17.findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) j17.findViewById(com.p314xaae8f345.mm.R.id.ocr);
            c22699x3dcdb352.getLayoutParams().height = (int) m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            c22699x3dcdb352.getLayoutParams().width = (int) m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
            gradientDrawable.setCornerRadius(m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            c22699x3dcdb352.setImageDrawable(gradientDrawable);
            c22699x3dcdb352.m82037xa10c26f6(false);
            c22699x3dcdb352.setVisibility(0);
        }
    }
}
