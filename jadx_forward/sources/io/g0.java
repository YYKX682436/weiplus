package io;

/* loaded from: classes10.dex */
public final class g0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public xb5.b f374936a;

    /* renamed from: b, reason: collision with root package name */
    public em.h1 f374937b;

    /* renamed from: c, reason: collision with root package name */
    public final io.f0 f374938c = new io.f0();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f374939d;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f374937b == null) {
            android.content.Context context2 = null;
            em.h1 h1Var = new em.h1(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.duy, (android.view.ViewGroup) null));
            this.f374937b = h1Var;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a18 = h1Var.a();
            if (a18 != null) {
                a18.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
                em.h1 h1Var2 = this.f374937b;
                if (h1Var2 != null && (a17 = h1Var2.a()) != null) {
                    context2 = a17.getContext();
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context2);
                c1162x665295de.Q(1);
                a18.mo7967x900dcbe1(c1162x665295de);
                a18.mo7960x6cab2c8d(this.f374938c);
            }
        }
        em.h1 h1Var3 = this.f374937b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h1Var3);
        android.view.View view = h1Var3.f335912a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(xb5.b bVar) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17;
        this.f374936a = bVar;
        if (bVar == null) {
            return;
        }
        java.util.List list = this.f374939d;
        if (list != null) {
            list.isEmpty();
        }
        java.util.List<xb5.a> list2 = bVar.f534544d;
        io.f0 f0Var = this.f374938c;
        f0Var.f374714d = list2;
        if (list2 != null) {
            for (xb5.a aVar : list2) {
                aVar.f534542g = bVar.f534545e;
                aVar.f534543h = bVar.f534546f;
            }
        }
        em.h1 h1Var = this.f374937b;
        if (h1Var != null && (a17 = h1Var.a()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/chatting/viewfactory/ContactListView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactListViewModel;)V", "Undefined", "scrollToPosition", "(I)V");
            a17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/chatting/viewfactory/ContactListView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactListViewModel;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        f0Var.m8146xced61ae5();
        this.f374939d = bVar.f534544d;
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374936a;
    }
}
