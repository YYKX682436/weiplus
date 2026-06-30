package r95;

/* loaded from: classes10.dex */
public abstract class a {
    public static final s95.y a(android.graphics.Rect toProto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(toProto, "$this$toProto");
        s95.x mo20599xaaa148a0 = s95.y.f486773i.mo20599xaaa148a0();
        mo20599xaaa148a0.f486769d = toProto.left;
        mo20599xaaa148a0.m20881x7bb163d5();
        mo20599xaaa148a0.f486770e = toProto.top;
        mo20599xaaa148a0.m20881x7bb163d5();
        mo20599xaaa148a0.f486771f = toProto.right;
        mo20599xaaa148a0.m20881x7bb163d5();
        mo20599xaaa148a0.f486772g = toProto.bottom;
        mo20599xaaa148a0.m20881x7bb163d5();
        s95.y mo20557x85702333 = mo20599xaaa148a0.mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    public static final android.graphics.Rect b(s95.y toRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(toRect, "$this$toRect");
        return new android.graphics.Rect(toRect.f486775d, toRect.f486776e, toRect.f486777f, toRect.f486778g);
    }

    public static final r95.f c(rm5.j toTrackProto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(toTrackProto, "$this$toTrackProto");
        r95.f fVar = new r95.f();
        long j17 = toTrackProto.f479034c;
        s95.m0 m0Var = (s95.m0) fVar.a();
        m0Var.f486647d = j17;
        m0Var.m20881x7bb163d5();
        java.lang.String value = toTrackProto.f479032a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(value, "value");
        s95.m0 m0Var2 = (s95.m0) fVar.a();
        m0Var2.getClass();
        m0Var2.f486648e = value;
        m0Var2.m20881x7bb163d5();
        s95.m0 m0Var3 = (s95.m0) fVar.a();
        int i17 = toTrackProto.f479033b;
        s95.u uVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? s95.u.UnknownType : s95.u.Audio : s95.u.Video : s95.u.Image;
        m0Var3.getClass();
        m0Var3.f486649f = uVar.mo20656x276ffe3f();
        m0Var3.m20881x7bb163d5();
        fVar.f(new r95.e(toTrackProto.f479035d, toTrackProto.f479036e));
        fVar.g(new r95.e(toTrackProto.f479037f, toTrackProto.f479038g));
        float f17 = toTrackProto.f479039h;
        s95.m0 m0Var4 = (s95.m0) fVar.a();
        m0Var4.f486660t = f17;
        m0Var4.m20881x7bb163d5();
        float f18 = toTrackProto.f479040i;
        s95.m0 m0Var5 = (s95.m0) fVar.a();
        m0Var5.f486658r = f18;
        m0Var5.m20881x7bb163d5();
        int i18 = toTrackProto.f479044m;
        s95.m0 m0Var6 = (s95.m0) fVar.a();
        m0Var6.f486659s = i18;
        m0Var6.m20881x7bb163d5();
        long j18 = toTrackProto.f479041j;
        s95.m0 m0Var7 = (s95.m0) fVar.a();
        m0Var7.f486654n = j18;
        m0Var7.m20881x7bb163d5();
        int i19 = toTrackProto.f479042k;
        int i27 = toTrackProto.f479043l;
        s95.m0 m0Var8 = (s95.m0) fVar.a();
        m0Var8.f486655o = i19;
        m0Var8.m20881x7bb163d5();
        s95.m0 m0Var9 = (s95.m0) fVar.a();
        m0Var9.f486656p = i27;
        m0Var9.m20881x7bb163d5();
        android.graphics.Rect value2 = toTrackProto.f479046o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(value2, "value");
        s95.n cropInfoBuilder = fVar.f474990b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(cropInfoBuilder, "cropInfoBuilder");
        cropInfoBuilder.f486665d = a(value2);
        cropInfoBuilder.m20881x7bb163d5();
        s95.m0 m0Var10 = (s95.m0) fVar.a();
        s95.o mo20556x59bc66e = fVar.f474990b.mo20556x59bc66e();
        m0Var10.getClass();
        m0Var10.f486661u = mo20556x59bc66e;
        m0Var10.m20881x7bb163d5();
        android.graphics.Rect value3 = toTrackProto.f479045n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(value3, "value");
        s95.n cropInfoBuilder2 = fVar.f474990b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(cropInfoBuilder2, "cropInfoBuilder");
        cropInfoBuilder2.f486666e = a(value3);
        cropInfoBuilder2.m20881x7bb163d5();
        s95.m0 m0Var11 = (s95.m0) fVar.a();
        s95.o mo20556x59bc66e2 = fVar.f474990b.mo20556x59bc66e();
        m0Var11.getClass();
        m0Var11.f486661u = mo20556x59bc66e2;
        m0Var11.m20881x7bb163d5();
        if (toTrackProto.f479047p) {
            s95.v vVar = s95.v.Custom;
            fVar.e(1);
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r5 != 270) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final rm5.v d(s95.i r18, com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r95.a.d(s95.i, com.tencent.mm.timelineedit.TimelineEditor):rm5.v");
    }
}
