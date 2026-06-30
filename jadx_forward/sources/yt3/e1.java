package yt3;

/* loaded from: classes10.dex */
public final class e1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f546948d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f546949e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f546950f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f546951g;

    public e1(android.widget.ImageView bgView, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgView, "bgView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546948d = bgView;
        this.f546949e = "MicroMsg.EditVideoBgPlugin";
        this.f546951g = bgView.getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r11 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ct0.b r10, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f546951g
            java.lang.String r1 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r1)
            java.lang.String r1 = r9.f546949e
            java.lang.String r2 = "initLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r1 = 0
            if (r11 == 0) goto L1a
            java.lang.Boolean r2 = r11.f237213r
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r2 == 0) goto Lac
            dw3.e0 r2 = dw3.e0.f325735a
            java.lang.String r3 = r10.d()
            dw3.d0 r2 = r2.a(r3)
            if (r2 == 0) goto Lac
            r3 = 1
            int r4 = r2.f325724b
            int r5 = r2.f325723a
            int r2 = r2.f325726d
            if (r2 == 0) goto L3a
            r6 = 180(0xb4, float:2.52E-43)
            if (r2 != r6) goto L37
            goto L3a
        L37:
            if (r4 <= r5) goto L3e
            goto L3c
        L3a:
            if (r5 <= r4) goto L3e
        L3c:
            r2 = r3
            goto L3f
        L3e:
            r2 = r1
        L3f:
            r4 = 0
            if (r2 == 0) goto La2
            int r11 = r11.F
            r2 = 3
            if (r11 != r2) goto La2
            ib5.j r11 = new ib5.j     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r2 = r10.f303737a     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            int r10 = r10.f303740d     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            long r5 = (long) r10     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            android.graphics.Bitmap r10 = ai3.d.q(r2, r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            android.graphics.Bitmap r10 = pm0.v.R(r10)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            if (r10 == 0) goto L6a
            r2 = 1101004800(0x41a00000, float:20.0)
            r11.b(r10, r2)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            r9.f546950f = r10     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            android.widget.ImageView r2 = r9.f546948d     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
            r2.setImageBitmap(r10)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L9a
        L6a:
            r11.mo135041x5cd39ffa()
            goto L91
        L6e:
            r10 = move-exception
            goto L74
        L70:
            r10 = move-exception
            goto L9c
        L72:
            r10 = move-exception
            r11 = r4
        L74:
            java.lang.String r2 = "MicroMsg.EditVideoPlayPlugin"
            java.lang.String r5 = "rsblur exception"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r10, r5, r6)     // Catch: java.lang.Throwable -> L9a
            int r10 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()     // Catch: java.lang.Throwable -> L9a
            if (r10 < r3) goto L8c
            java.lang.String r10 = "RenderScript Exception"
            android.widget.Toast r10 = dp.a.m125854x26a183b(r0, r10, r1)     // Catch: java.lang.Throwable -> L9a
            r10.show()     // Catch: java.lang.Throwable -> L9a
        L8c:
            r9.f546950f = r4     // Catch: java.lang.Throwable -> L9a
            if (r11 == 0) goto L91
            goto L6a
        L91:
            nu3.i r10 = nu3.i.f421751a
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r10 = nu3.i.f421754d
            r0 = 2
            r10.D = r0
            goto Lac
        L9a:
            r10 = move-exception
            r4 = r11
        L9c:
            if (r4 == 0) goto La1
            r4.mo135041x5cd39ffa()
        La1:
            throw r10
        La2:
            r9.f546950f = r4
            nu3.i r10 = nu3.i.f421751a
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r10 = nu3.i.f421754d
            r0 = 1
            r10.D = r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.e1.a(ct0.b, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    public final java.lang.String b() {
        java.lang.String sb6;
        if (this.f546950f == null) {
            return null;
        }
        dw3.c0 c0Var = dw3.c0.f325715a;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        if (valueOf == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(((java.lang.String) ((jz5.n) dw3.c0.f325718d).mo141623x754a37bb()) + valueOf + ".p");
            sb7.append(".blurt");
            sb6 = sb7.toString();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f546950f, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb6, false);
        return sb6;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        android.graphics.Bitmap bitmap = this.f546950f;
        boolean z17 = false;
        if (bitmap != null && !bitmap.isRecycled()) {
            z17 = true;
        }
        if (z17) {
            android.graphics.Bitmap bitmap2 = this.f546950f;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f546950f = null;
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        android.widget.ImageView imageView = this.f546948d;
        imageView.setBackgroundColor(imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }
}
