package m31;

/* loaded from: classes9.dex */
public final class g0 extends m31.f {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f404677m;

    /* renamed from: n, reason: collision with root package name */
    public final m31.d f404678n;

    public g0(android.content.Context context, m31.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f404677m = context;
        this.f404678n = listener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f404667d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo863xcdaf1228(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L11
            java.util.ArrayList r0 = r2.f404667d
            int r1 = r0.size()
            if (r3 >= r1) goto L11
            java.lang.Object r3 = r0.get(r3)
            m31.a r3 = (m31.a) r3
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L19
            int r3 = r3.h()
            goto L1b
        L19:
            int r3 = r2.f404669f
        L1b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m31.g0.mo863xcdaf1228(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r13, int r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m31.g0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        int i18 = this.f404668e;
        android.content.Context context = this.f404677m;
        if (i17 == i18) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxa, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new m31.d0(inflate);
        }
        if (i17 == this.f404669f) {
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.epr, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new m31.e0(inflate2);
        }
        android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.epr, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        return new m31.e0(inflate3);
    }
}
