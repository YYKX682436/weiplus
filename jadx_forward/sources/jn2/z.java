package jn2;

/* loaded from: classes5.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f382293d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f382294e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382295f;

    public z(android.content.Context context, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f382293d = onItemClick;
        this.f382294e = new java.util.ArrayList();
        this.f382295f = "";
        context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f382294e).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1.length() == 0) != false) goto L14;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r6, int r7) {
        /*
            r5 = this;
            jn2.x r6 = (jn2.x) r6
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.util.List r0 = r5.f382294e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r7 = r0.get(r7)
            r45.hy1 r7 = (r45.hy1) r7
            java.lang.String r0 = r7.f458086f
            java.lang.String r1 = r5.f382295f
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            int r4 = r0.length()
            if (r4 != 0) goto L20
            goto L22
        L20:
            r4 = r2
            goto L23
        L22:
            r4 = r3
        L23:
            if (r4 != 0) goto L2e
            int r1 = r1.length()
            if (r1 != 0) goto L2c
            r2 = r3
        L2c:
            if (r2 == 0) goto L33
        L2e:
            if (r0 == 0) goto L31
            goto L33
        L31:
            java.lang.String r0 = ""
        L33:
            android.widget.TextView r1 = r6.f382277d
            r1.setText(r0)
            android.view.View r6 = r6.f3639x46306858
            jn2.y r0 = new jn2.y
            r0.<init>(r7, r5)
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.z.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e8i, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new jn2.x(inflate);
    }
}
