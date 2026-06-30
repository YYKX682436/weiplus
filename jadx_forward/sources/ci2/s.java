package ci2;

/* loaded from: classes10.dex */
public final class s extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f123233b = jz5.h.b(ci2.p.f123228d);

    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950) c14233xcca2a527;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "ChatVoiceRoomPreviewLayout";
    }

    @Override // gi2.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        ci2.r rVar = new ci2.r(this, parent);
        if (parent.getWidth() != 0 && parent.getHeight() != 0) {
            rVar.mo152xb9724478();
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = parent.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new ci2.q(parent, rVar));
        }
    }
}
