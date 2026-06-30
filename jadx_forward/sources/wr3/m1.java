package wr3;

/* loaded from: classes11.dex */
public final class m1 extends wr3.f0 {

    /* renamed from: x, reason: collision with root package name */
    public int f530370x;

    /* renamed from: y, reason: collision with root package name */
    public int f530371y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f530372z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact) {
        super(context, bizUsername, z17, i17, j17, z18, config, contact);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x028a, code lost:
    
        if (r4 != 4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // wr3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r35, int r36) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr3.m1.L(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // wr3.f0
    public wr3.c0 N(wr3.n0 status, r45.s5 message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        return new wr3.l1(status, message, 0);
    }

    @Override // wr3.f0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 O(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3d, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new yr3.d1(this, inflate, this.f530370x, this.f530371y, this.f530317s.g());
    }

    @Override // wr3.f0
    public int P() {
        return 1;
    }

    @Override // wr3.f0
    public int Q() {
        return 2;
    }

    @Override // wr3.f0
    public int R() {
        return 0;
    }

    @Override // wr3.f0
    public boolean S(r45.s5 bizMessage) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage, "bizMessage");
        r45.p5 p5Var = bizMessage.f467047i;
        if (!((p5Var == null || (linkedList = p5Var.f464287e) == null || !(linkedList.isEmpty() ^ true)) ? false : true)) {
            r45.y5 y5Var = bizMessage.f467042d;
            if (!(y5Var != null && y5Var.f472324e == 1) || bizMessage.f467043e == null) {
                return false;
            }
        }
        return true;
    }

    @Override // wr3.f0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a19, parent, false);
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            layoutParams = layoutParams2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.f93474i = true;
            }
            return new wr3.d0(inflate);
        }
        if (i17 != 2) {
            return O(parent, i17);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3k, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams3 = inflate2.getLayoutParams();
        layoutParams = layoutParams3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams3 : null;
        if (layoutParams != null) {
            layoutParams.f93474i = true;
        }
        return new wr3.e0(inflate2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        if (this.f530317s.g() != sr3.a.f493363f || (context = this.f530311m) == null || !(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) || this.f530372z) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        gr3.c.d((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) context);
        this.f530372z = true;
    }
}
