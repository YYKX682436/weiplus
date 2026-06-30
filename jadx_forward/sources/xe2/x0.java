package xe2;

/* loaded from: classes3.dex */
public final class x0 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
    @Override // we2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.LinkedList r6) {
        /*
            r5 = this;
            java.lang.String r0 = "msgList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r6.next()
            r45.ch1 r0 = (r45.ch1) r0
            r1 = 1
            int r2 = r0.m75939xb282bd08(r1)
            r3 = 20068(0x4e64, float:2.8121E-41)
            if (r2 != r3) goto L9
            r45.ok1 r2 = new r45.ok1
            r2.<init>()
            r3 = 4
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r3)
            r3 = 0
            if (r0 == 0) goto L30
            byte[] r0 = r0.g()
            goto L31
        L30:
            r0 = r3
        L31:
            if (r0 != 0) goto L34
            goto L44
        L34:
            r2.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L38
            goto L45
        L38:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "safeParser"
            java.lang.String r4 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r4, r0)
        L44:
            r2 = r3
        L45:
            if (r2 == 0) goto L9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "handleMultiStream object_id: "
            r0.<init>(r3)
            r3 = 0
            long r3 = r2.m75942xfb822ef2(r3)
            r0.append(r3)
            java.lang.String r3 = " live_id: "
            r0.append(r3)
            long r3 = r2.m75942xfb822ef2(r1)
            r0.append(r3)
            java.lang.String r1 = " deleteStreamId: "
            r0.append(r1)
            r1 = 2
            java.lang.String r1 = r2.m75945x2fec8307(r1)
            r0.append(r1)
            java.lang.String r1 = " seq: "
            r0.append(r1)
            r1 = 3
            long r3 = r2.m75942xfb822ef2(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicIntercomMsgInterceptor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<mm2.h7> r0 = mm2.h7.class
            gk2.e r1 = r5.f526800a
            androidx.lifecycle.c1 r0 = r1.a(r0)
            mm2.h7 r0 = (mm2.h7) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.f410651m
            r0.mo7808x76db6cb1(r2)
            goto L9
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.x0.d(java.util.LinkedList):void");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20068};
    }
}
