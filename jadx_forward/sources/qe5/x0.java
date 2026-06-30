package qe5;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Button f443746a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f443747b;

    /* renamed from: c, reason: collision with root package name */
    public final oi3.g f443748c;

    /* renamed from: d, reason: collision with root package name */
    public final em.d0 f443749d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443750e;

    public x0(android.widget.Button button, android.widget.TextView textView, oi3.g gVar, em.d0 d0Var) {
        this.f443746a = button;
        this.f443747b = textView;
        this.f443748c = gVar;
        this.f443749d = d0Var;
        if (textView != null) {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgFileExpiredInterval", 432000);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            if (((int) java.lang.Math.floor(((b17 - c01.id.f(gVar.m75942xfb822ef2(gVar.f427150d + 2) / 1000)) * 1.0d) / 86400)) >= 1) {
                if (textView == null) {
                    return;
                }
                textView.setText("");
            } else {
                if (textView == null) {
                    return;
                }
                textView.setText("");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r8) {
        /*
            r7 = this;
            android.widget.Button r0 = r7.f443746a
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.setVisibility(r8)
        L8:
            android.widget.TextView r1 = r7.f443747b
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L24
            java.lang.CharSequence r5 = r1.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 <= 0) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r4
        L20:
            if (r5 == 0) goto L24
            r5 = r1
            goto L25
        L24:
            r5 = r3
        L25:
            if (r5 != 0) goto L28
            goto L2b
        L28:
            r5.setVisibility(r8)
        L2b:
            if (r1 == 0) goto L37
            int r5 = r1.getVisibility()
            r6 = 8
            if (r5 != r6) goto L37
            r5 = r2
            goto L38
        L37:
            r5 = r4
        L38:
            if (r5 == 0) goto L80
            em.d0 r5 = r7.f443749d
            if (r5 == 0) goto L4c
            android.widget.TextView r6 = r5.k()
            if (r6 == 0) goto L4c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L4c
            r6 = r2
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 != 0) goto L94
            if (r5 == 0) goto L5e
            android.widget.TextView r5 = r5.l()
            if (r5 == 0) goto L5e
            int r5 = r5.getVisibility()
            if (r5 != r8) goto L5e
            goto L5f
        L5e:
            r2 = r4
        L5f:
            if (r2 != 0) goto L94
            if (r0 == 0) goto L68
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            goto L69
        L68:
            r8 = r3
        L69:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r8, r0)
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            if (r1 == 0) goto L76
            android.content.Context r3 = r1.getContext()
        L76:
            r0 = 2131165403(0x7f0700db, float:1.7945022E38)
            int r0 = i65.a.h(r3, r0)
            r8.bottomMargin = r0
            goto L94
        L80:
            if (r0 == 0) goto L87
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            goto L88
        L87:
            r8 = r3
        L88:
            boolean r0 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L8f
            r3 = r8
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
        L8f:
            if (r3 != 0) goto L92
            goto L94
        L92:
            r3.bottomMargin = r4
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.x0.a(int):void");
    }

    public final void b(boolean z17, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.Object[] objArr = new java.lang.Object[1];
        oi3.g gVar = this.f443748c;
        objArr[0] = gVar != null ? java.lang.Long.valueOf(gVar.m75942xfb822ef2(gVar.f427150d + 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePageLogicUIC", "showErrorTip overtime %s", objArr);
        android.widget.Button button = this.f443746a;
        if (button != null) {
            button.setVisibility(4);
        }
        android.widget.TextView textView = this.f443747b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (!z17) {
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cex);
            }
            if (str != null) {
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                byte[] bytes = str.getBytes(UTF_8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                if (bytes.length > 255) {
                    if (textView != null) {
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572769le2);
                    }
                }
            }
            jx3.f.INSTANCE.d(31328, 3, 5000);
        } else if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cew);
        }
        if (textView != null && (resources = textView.getResources()) != null) {
            textView.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77883xa3c58d61));
        }
        if (this.f443750e) {
            return;
        }
        this.f443750e = true;
    }
}
