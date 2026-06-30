package uc5;

/* loaded from: classes10.dex */
public abstract class a0 extends uc5.n {

    /* renamed from: p, reason: collision with root package name */
    public static android.graphics.drawable.ColorDrawable f508003p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ad5.l0[] availableOperations) {
        super(availableOperations);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableOperations, "availableOperations");
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eki, (android.view.ViewGroup) null);
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // uc5.n, in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.l(holder);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            em.y1 p17 = p(holder);
            java.lang.Object obj = holder.f374654e;
            y(p17, obj instanceof zc5.o ? (zc5.o) obj : null);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (binding.f336475d == null) {
            binding.f336475d = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21831x2f2052a2) binding.f336472a.findViewById(com.p314xaae8f345.mm.R.id.bsc);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21831x2f2052a2 c21831x2f2052a2 = binding.f336475d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21831x2f2052a2, "getCheckBox(...)");
        return c21831x2f2052a2;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.view.View view = binding.f336472a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.y1 binding = (em.y1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.view.View view = binding.f336472a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.graphics.drawable.ColorDrawable colorDrawable = f508003p;
        android.view.View view2 = binding.f336472a;
        if (colorDrawable == null) {
            colorDrawable = new android.graphics.drawable.ColorDrawable(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b, null));
            f508003p = colorDrawable;
        }
        binding.a().setImageDrawable(colorDrawable);
        binding.a().setBackground(null);
        if (binding.b().length() > 0) {
            binding.b().setText("");
        }
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryGridItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object context = view2.getContext();
        y(binding, context instanceof zc5.o ? (zc5.o) context : null);
    }

    public final void y(em.y1 y1Var, zc5.o oVar) {
        java.lang.Object tag = y1Var.a().getTag(com.p314xaae8f345.mm.R.id.h9z);
        w65.m mVar = tag instanceof w65.m ? (w65.m) tag : null;
        y1Var.a().setTag(com.p314xaae8f345.mm.R.id.h9z, null);
        if (mVar == null || oVar == null) {
            return;
        }
        oVar.d3().d(mVar.id());
    }

    @Override // uc5.n
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public em.y1 p(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.uhl);
        em.y1 y1Var = tag instanceof em.y1 ? (em.y1) tag : null;
        if (y1Var != null) {
            return y1Var;
        }
        android.view.View view = holder.f3639x46306858;
        em.y1 y1Var2 = new em.y1(view);
        view.setTag(com.p314xaae8f345.mm.R.id.uhl, y1Var2);
        return y1Var2;
    }
}
