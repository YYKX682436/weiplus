package uc5;

/* loaded from: classes9.dex */
public abstract class z extends uc5.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ad5.l0[] availableOperations) {
        super(availableOperations);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableOperations, "availableOperations");
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekq, (android.view.ViewGroup) null);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new em.e2(holder.f3639x46306858);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (binding.f335814c == null) {
            binding.f335814c = (android.widget.CheckBox) binding.f335812a.findViewById(com.p314xaae8f345.mm.R.id.bsc);
        }
        android.widget.CheckBox checkBox = binding.f335814c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(checkBox, "getCheckBox(...)");
        return checkBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.view.View view = binding.f335812a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.e2 binding = (em.e2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (binding.a().getChildCount() > 0) {
            int childCount = binding.a().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = binding.a().getChildAt(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryEmojiItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryStickerItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryEmojiItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryStickerItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
