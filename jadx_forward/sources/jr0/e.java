package jr0;

/* loaded from: classes12.dex */
public class e implements jj.e {

    /* renamed from: b, reason: collision with root package name */
    public static jr0.e f382860b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f382861c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Random f382862a = new java.util.Random();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_report_frame", false) != false) goto L6;
     */
    static {
        /*
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = o45.wf.f424566k
            if (r0 != 0) goto L13
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            java.lang.String r1 = "clicfg_report_frame"
            r2 = 0
            boolean r0 = r0.i(r1, r2)
            if (r0 == 0) goto L14
        L13:
            r2 = 1
        L14:
            jr0.e.f382861c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.e.m141251x8c160ea9():void");
    }

    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        if (this.f382862a.nextInt(3000) == 0) {
            int i17 = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(java.lang.Math.round(100.0f * f17));
            objArr[1] = str;
            objArr[2] = 11;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = java.lang.Integer.valueOf(java.lang.Math.round(f19));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append('{');
            for (kj.h hVar : kj.h.m143530xcee59d22()) {
                sb7.append('(');
                sb7.append(hVar.name());
                sb7.append("_LEVEL=");
                sb7.append(iArr[hVar.ordinal()]);
                sb7.append(" ");
                sb7.append(hVar.name());
                sb7.append("_SUM=");
                sb7.append(iArr2[hVar.ordinal()]);
                sb7.append("); ");
            }
            sb7.setLength(sb7.length() - 2);
            sb7.append("}");
            sb6.append(sb7.toString());
            sb6.append("; ");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append('{');
            for (kj.i iVar : kj.i.m143533xcee59d22()) {
                sb8.append(iVar.name());
                sb8.append('=');
                sb8.append(jArr[iVar.ordinal()]);
                sb8.append("; ");
            }
            sb8.setLength(sb8.length() - 2);
            sb8.append("}");
            sb6.append(sb8.toString());
            sb6.append("; avgDroppedFrame=");
            sb6.append(f17);
            sb6.append("; avgRefreshRate=");
            sb6.append(java.lang.Math.round(f18));
            sb6.append("; avgFPS=");
            sb6.append(f19);
            sb6.append('}');
            objArr[5] = sb6.toString();
            fVar.d(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p192x7709c518.C1655xa2881f1c.f5477xbcf1dc07, objArr);
        }
    }

    @Override // jj.e
    public boolean b() {
        return true;
    }

    @Override // jj.e
    public int c() {
        return 5000;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    @Override // jj.e
    /* renamed from: getName */
    public java.lang.String mo141031xfb82e301() {
        return null;
    }
}
