package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingRecordMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/b0;", "Lc11/f;", "f", "Lcom/tencent/mm/mvvm/MvvmView;", "getHolder", "()Lcom/tencent/mm/mvvm/MvvmView;", "setHolder", "(Lcom/tencent/mm/mvvm/MvvmView;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView */
/* loaded from: classes9.dex */
public final class C22088xa3cc645c extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.b0> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22088xa3cc645c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 v17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).v(context);
        m80105x101324ae(v17);
        return v17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.b0 b0Var = (z01.b0) pVar2;
        if (b0Var == null) {
            return;
        }
        c11.f fVar = new c11.f();
        java.lang.String str = b0Var.f550485d;
        if (str != null) {
            if (!(!r26.n0.N(str))) {
                str = null;
            }
            if (str != null) {
                fVar.f119368d = b0Var.f550485d;
            }
        }
        java.lang.String str2 = b0Var.f550486e;
        if (str2 != null) {
            if (!(!r26.n0.N(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                fVar.f119370f = b0Var.f550486e;
                fVar.f119373i = null;
            }
        }
        int i17 = b0Var.f550487f;
        if (i17 != 0) {
            fVar.f119372h = i17;
        }
        a11.b bVar = new a11.b();
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        bVar.f82034e = string;
        fVar.f119377p = bVar;
        m80104x1cddf0a2().m48330xfcfee142(fVar);
        android.view.View.OnClickListener onClickListener = b0Var.f550488g;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = b0Var.f550489h;
        if (onLongClickListener != null) {
            setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = b0Var.f550490i;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
    }

    /* renamed from: getHolder */
    public final com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.f> m80104x1cddf0a2() {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.f> abstractC11172x705e5905 = this.holder;
        if (abstractC11172x705e5905 != null) {
            return abstractC11172x705e5905;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: setHolder */
    public final void m80105x101324ae(com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.f> abstractC11172x705e5905) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC11172x705e5905, "<set-?>");
        this.holder = abstractC11172x705e5905;
    }

    public /* synthetic */ C22088xa3cc645c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22088xa3cc645c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
