package dd5;

/* loaded from: classes12.dex */
public final class c3 extends uc5.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final dd5.c3 f310641q = new dd5.c3();

    public c3() {
        super(dd5.f3.f310674b.f508072a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dd5.a3
            if (r0 == 0) goto L13
            r0 = r11
            dd5.a3 r0 = (dd5.a3) r0
            int r1 = r0.f310621g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310621g = r1
            goto L18
        L13:
            dd5.a3 r0 = new dd5.a3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f310619e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f310621g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r10 = r0.f310618d
            com.tencent.mm.storage.f9 r10 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L49
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlinx.coroutines.p0 r11 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            dd5.b3 r2 = new dd5.b3
            r4 = 0
            r2.<init>(r10, r4)
            r0.f310618d = r10
            r0.f310621g = r3
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r2, r0)
            if (r11 != r1) goto L49
            return r1
        L49:
            jz5.l r11 = (jz5.l) r11
            java.lang.Object r0 = r11.f384366d
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.f384367e
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            dd5.e3 r0 = new dd5.e3
            long r2 = r10.m124847x74d37ac6()
            java.lang.String r4 = r10.Q0()
            java.lang.String r1 = "getTalker(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r7 = r10.m124847x74d37ac6()
            r1.append(r7)
            r5 = 95
            r1.append(r5)
            java.lang.String r7 = r10.Q0()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r10 = r10.z0()
            r1.append(r10)
            java.lang.String r5 = r1.toString()
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(r11)
            java.lang.String r10 = "formatSecToMin(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r10)
            r1 = r0
            r1.<init>(r2, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.c3.A(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.y1 binding = (em.y1) obj;
        dd5.e3 e3Var = (dd5.e3) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (e3Var == null) {
            return;
        }
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryGridItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeVideo$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        binding.b().setText(e3Var.f310662e);
        zc5.o oVar = context instanceof zc5.o ? (zc5.o) context : null;
        if (oVar == null) {
            return;
        }
        android.widget.ImageView a17 = binding.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getContentIv(...)");
        int width = a17.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        int i17 = layoutParams != null ? layoutParams.width : 0;
        if (width < i17) {
            width = i17;
        }
        if (width < 200) {
            width = 200;
        }
        int height = a17.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams2 = a17.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        if (height < i18) {
            height = i18;
        }
        int i19 = height >= 200 ? height : 200;
        java.lang.Object tag = a17.getTag(com.p314xaae8f345.mm.R.id.h9z);
        f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
        java.lang.String str = bVar != null ? bVar.f341610h : null;
        java.lang.String key = e3Var.f310660c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, key)) {
            return;
        }
        if (bVar != null) {
            oVar.d3().d(bVar.id());
        }
        a17.setTag(com.p314xaae8f345.mm.R.id.h9z, null);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) m11.b1.Di().f404271e).i(key);
        if (bitmap != null) {
            a17.setImageBitmap(bitmap);
            return;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = f80.b.f341609o;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String thumbPath = e3Var.f310661d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        f80.b bVar2 = new f80.b(key, new f80.e(thumbPath, width, i19), weakReference, null);
        a17.setTag(com.p314xaae8f345.mm.R.id.h9z, bVar2);
        oVar.d3().k(bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        long[] jArr;
        em.y1 binding = (em.y1) obj;
        dd5.e3 e3Var = (dd5.e3) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (e3Var == null) {
            return;
        }
        zc5.p pVar = context instanceof zc5.p ? (zc5.p) context : null;
        if (pVar == null || (jArr = pVar.G()) == null) {
            jArr = new long[]{e3Var.f310658a};
        }
        xc5.c2.f534939f.a(context, e3Var.f310659b, jArr, e3Var.f310658a);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (!f9Var.M2()) {
            if (f9Var.m78014x7b98c171() || f9Var.Y2() || f9Var.mo78013xfb85f7b0() == 44) {
                java.lang.Object A = A(f9Var, interfaceC29045xdcb5ca57);
                return A == pz5.a.f440719d ? A : (dd5.e3) A;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideo", "prepareViewModel: unhandled type=" + f9Var.mo78013xfb85f7b0());
            return null;
        }
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126731xdc93280d(U1, true);
        int i17 = bVar.f513848e;
        java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(i17 + 14);
        java.lang.String b17 = tv.a.b(m75945x2fec8307);
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        java.lang.String str = f9Var.m124847x74d37ac6() + '_' + f9Var.Q0() + '_' + m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        a15.a aVar = (a15.a) bVar.m75936x14adae67(i17 + 35);
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(aVar != null ? (int) aVar.j() : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "formatSecToMin(...)");
        return new dd5.e3(m124847x74d37ac6, Q0, str, b17, u17);
    }
}
