package dd5;

/* loaded from: classes12.dex */
public final class m1 extends uc5.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final dd5.m1 f310753q = new dd5.m1();

    public m1() {
        super(dd5.p1.f310776b.f508072a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        java.lang.String key;
        em.y1 binding = (em.y1) obj;
        dd5.o1 o1Var = (dd5.o1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (o1Var == null) {
            return;
        }
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
        ((v70.a) ((xs.a1) i95.n0.c(xs.a1.class))).getClass();
        oi3.f simpleImgMsgInfo = o1Var.f310768a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleImgMsgInfo, "simpleImgMsgInfo");
        int i27 = simpleImgMsgInfo.f427150d;
        int i28 = i27 + 0;
        if (simpleImgMsgInfo.m75942xfb822ef2(i28) == 0) {
            key = "file_thumb_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(simpleImgMsgInfo.k()) + '_' + width + '_' + i19;
        } else {
            key = "msgInfo_thumb_" + simpleImgMsgInfo.m75942xfb822ef2(i28) + '_' + simpleImgMsgInfo.m75945x2fec8307(i27 + 3) + '_' + width + '_' + i19;
        }
        java.lang.Object tag = a17.getTag(com.p314xaae8f345.mm.R.id.h9z);
        f80.b bVar = tag instanceof f80.b ? (f80.b) tag : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar != null ? bVar.f341610h : null, key)) {
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
        f80.b bVar2 = new f80.b(key, new f80.d(simpleImgMsgInfo, width, i19, o1Var.f310769b), weakReference, null);
        a17.setTag(com.p314xaae8f345.mm.R.id.h9z, bVar2);
        oVar.d3().k(bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        long[] jArr;
        em.y1 binding = (em.y1) obj;
        dd5.o1 o1Var = (dd5.o1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (o1Var == null) {
            return;
        }
        zc5.p pVar = context instanceof zc5.p ? (zc5.p) context : null;
        if (pVar != null) {
            pVar.E1();
        }
        oi3.f fVar = o1Var.f310768a;
        if (pVar == null || (jArr = pVar.G()) == null) {
            jArr = new long[]{fVar.m75942xfb822ef2(fVar.f427150d + 0)};
        }
        xc5.c2.f534939f.a(context, fVar.m75945x2fec8307(fVar.f427150d + 3), jArr, fVar.m75942xfb822ef2(fVar.f427150d + 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // uc5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(android.content.Context r5, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof dd5.l1
            if (r5 == 0) goto L13
            r5 = r7
            dd5.l1 r5 = (dd5.l1) r5
            int r0 = r5.f310735g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f310735g = r0
            goto L18
        L13:
            dd5.l1 r5 = new dd5.l1
            r5.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r5.f310733e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f310735g
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r5.f310732d
            oi3.f r5 = (oi3.f) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            oi3.f r7 = new oi3.f
            r7.<init>()
            c01.gb.a(r7, r6)
            java.lang.Class<xs.a1> r6 = xs.a1.class
            i95.m r6 = i95.n0.c(r6)
            xs.a1 r6 = (xs.a1) r6
            r5.f310732d = r7
            r5.f310735g = r2
            v70.a r6 = (v70.a) r6
            java.lang.Object r5 = r6.Zi(r7, r5)
            if (r5 != r0) goto L53
            return r0
        L53:
            r3 = r7
            r7 = r5
            r5 = r3
        L56:
            xs.z0 r7 = (xs.z0) r7
            dd5.o1 r6 = new dd5.o1
            r6.<init>(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.m1.w(android.content.Context, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
