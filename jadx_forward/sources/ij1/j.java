package ij1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes15.dex */
public class j extends i95.w implements k01.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f373211d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f373212e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f373213f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f373214g = new java.util.concurrent.ConcurrentHashMap();

    public j() {
        Vi(1, new ij1.e(this));
    }

    public final void Ai(k01.s0 s0Var, int i17) {
        if (s0Var != null) {
            s0Var.a(i17);
        }
    }

    public l01.q Bi(int i17, int i18) {
        return Di(i17, i18, k01.r0.DECODE_TYPE_DEFAULT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l01.q Di(int r4, int r5, k01.r0 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "%d-%d-dp"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.util.Map r1 = r3.f373211d
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
            if (r1 == 0) goto L26
            java.lang.Object r1 = r1.get()
            l01.q r1 = (l01.q) r1
            if (r1 != 0) goto L5b
        L26:
            monitor-enter(r3)
            java.util.Map r1 = r3.f373211d     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L5c
            l01.q r1 = (l01.q) r1     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L5a
        L3b:
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L5c
            int r4 = i65.a.b(r1, r4)     // Catch: java.lang.Throwable -> L5c
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L5c
            int r5 = i65.a.b(r1, r5)     // Catch: java.lang.Throwable -> L5c
            hj1.a r1 = new hj1.a     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L5c
            r1.f363111f = r6     // Catch: java.lang.Throwable -> L5c
            java.util.Map r4 = r3.f373211d     // Catch: java.lang.Throwable -> L5c
            java.lang.ref.SoftReference r5 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: java.lang.Throwable -> L5c
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L5c
        L5a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
        L5b:
            return r1
        L5c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ij1.j.Di(int, int, k01.r0):l01.q");
    }

    public synchronized void Ni(int i17, android.os.Bundle bundle) {
        ij1.i iVar = (ij1.i) ((java.util.concurrent.ConcurrentHashMap) this.f373213f).get(java.lang.Integer.valueOf(i17));
        if (iVar != null) {
            iVar.a(bundle);
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f373214g).put(java.lang.Integer.valueOf(i17), bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "onAction(%d, %s)", java.lang.Integer.valueOf(i17), bundle);
    }

    public boolean Ri(java.lang.String str, android.view.View view, android.os.Bundle bundle, k01.s0 s0Var) {
        android.graphics.Bitmap f17;
        android.graphics.Bitmap bitmap = null;
        iz5.a.d(null, view);
        iz5.a.d(null, bundle);
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "onBindView(%s, %s)", str, java.lang.Integer.valueOf(view.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77 c12589x40ea1b77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77) view;
        boolean z17 = bundle.getBoolean("is_dynamic_page");
        c12589x40ea1b77.m52701x53bfe316(bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, ""));
        boolean z18 = bundle.getBoolean("is_video", false);
        int i17 = bundle.getInt("sub_type", 0);
        if (z18 || i17 == 1) {
            c12589x40ea1b77.m52694x4edb80de().setVisibility(0);
        } else {
            c12589x40ea1b77.m52694x4edb80de().setVisibility(8);
        }
        if (!z17) {
            c12589x40ea1b77.m52691x819099f().setVisibility(0);
            byte[] byteArray = bundle.getByteArray("image_data");
            if (byteArray != null && byteArray.length > 0) {
                int length = byteArray.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(byteArray);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService", "onBindView", "(Ljava/lang/String;Landroid/view/View;Landroid/os/Bundle;Lcom/tencent/mm/modelappbrand/IWxaShareMessageService$OnLoadImageResult;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService", "onBindView", "(Ljava/lang/String;Landroid/view/View;Landroid/os/Bundle;Lcom/tencent/mm/modelappbrand/IWxaShareMessageService$OnLoadImageResult;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (decodeByteArray != null && !decodeByteArray.isRecycled()) {
                    c12589x40ea1b77.m52698x27621963(decodeByteArray);
                    Ai(s0Var, 0);
                    return true;
                }
            }
            java.lang.String string = bundle.getString("delay_load_img_path");
            if (z18) {
                java.lang.String string2 = bundle.getString("video_path");
                java.lang.String string3 = bundle.getString("video_thumb_path");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                    android.graphics.Bitmap f18 = l01.d0.f396294a.f(string3, null);
                    if (f18 != null && !f18.isRecycled()) {
                        c12589x40ea1b77.m52698x27621963(f18);
                        Ai(s0Var, 0);
                        return true;
                    }
                    c12589x40ea1b77.b();
                    Ai(s0Var, 1);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    c12589x40ea1b77.m52691x819099f().setOnClickListener(new ij1.f(this));
                }
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                java.lang.String string4 = bundle.getString("image_url");
                if (string4 != null && (string4.startsWith("http://") || string4.startsWith("https://"))) {
                    c12589x40ea1b77.m52700xf5028871(s0Var);
                    c12589x40ea1b77.m52699x43560096(string4);
                } else {
                    if (string4 != null && string4.startsWith("file://") && (f17 = l01.d0.f396294a.f(string4, null)) != null && !f17.isRecycled()) {
                        c12589x40ea1b77.m52698x27621963(f17);
                        Ai(s0Var, 0);
                        return true;
                    }
                    c12589x40ea1b77.b();
                    Ai(s0Var, 1);
                }
            } else {
                if (!string.startsWith("delayLoadFile://")) {
                    bitmap = l01.d0.f396294a.f(string, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "findCachedLocal(%s)", string);
                } else if (((java.util.concurrent.ConcurrentHashMap) this.f373214g).containsKey(2)) {
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(string.replace("delayLoadFile://", ""));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "getBitmapNative(%s)", string);
                }
                if (bitmap != null) {
                    if (bitmap.isRecycled()) {
                        c12589x40ea1b77.m52700xf5028871(s0Var);
                        c12589x40ea1b77.m52699x43560096(string);
                    } else {
                        c12589x40ea1b77.m52698x27621963(bitmap);
                        Ai(s0Var, 0);
                    }
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "delay loadImage(%s)", string);
                c12589x40ea1b77.m52693xcc04d8cb().setVisibility(0);
                c12589x40ea1b77.m52692x4986166e().setVisibility(4);
                c12589x40ea1b77.m52691x819099f().setVisibility(4);
                c12589x40ea1b77.m52693xcc04d8cb().e();
                Vi(2, new ij1.h(this, c12589x40ea1b77, s0Var));
            }
        }
        return true;
    }

    public void Ui(java.lang.String str, android.view.View view) {
        iz5.a.d(null, view);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaShareMessageService", "onUnbindView(%s, %s)", str, java.lang.Integer.valueOf(view.hashCode()));
            ((java.util.concurrent.ConcurrentHashMap) this.f373213f).remove(2);
        }
    }

    public final void Vi(int i17, ij1.i iVar) {
        this.f373213f.put(java.lang.Integer.valueOf(i17), iVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = this.f373214g;
        if (map.containsKey(valueOf)) {
            iVar.a((android.os.Bundle) map.get(java.lang.Integer.valueOf(i17)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.View wi(android.content.Context context, android.os.Bundle bundle, boolean z17, k01.t0 t0Var) {
        iz5.a.d(null, context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77 c12589x40ea1b77 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44.C12589x40ea1b77(context);
        if (bundle != null) {
            int i17 = bundle.getInt("key_biz", 2);
            boolean z18 = bundle.getBoolean("is_video", false);
            if (ot0.o.b(i17) || z18) {
                c12589x40ea1b77.f170396s = true;
                android.view.ViewGroup.LayoutParams layoutParams = c12589x40ea1b77.f170385e.getLayoutParams();
                layoutParams.width = i65.a.b(c12589x40ea1b77.getContext(), 112);
                layoutParams.height = i65.a.b(c12589x40ea1b77.getContext(), 63);
                c12589x40ea1b77.f170385e.setLayoutParams(layoutParams);
                c12589x40ea1b77.f170385e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                android.view.ViewGroup.LayoutParams layoutParams2 = c12589x40ea1b77.f170386f.getLayoutParams();
                layoutParams2.width = i65.a.b(c12589x40ea1b77.getContext(), 112);
                layoutParams2.height = i65.a.b(c12589x40ea1b77.getContext(), 63);
                c12589x40ea1b77.f170386f.setLayoutParams(layoutParams2);
                android.view.ViewGroup.LayoutParams layoutParams3 = c12589x40ea1b77.f170395r.getLayoutParams();
                layoutParams3.width = i65.a.b(c12589x40ea1b77.getContext(), 112);
                layoutParams3.height = i65.a.b(c12589x40ea1b77.getContext(), 63);
                c12589x40ea1b77.f170395r.setLayoutParams(layoutParams3);
                if (i17 == 0) {
                    c12589x40ea1b77.f170391n.setImageResource(com.p314xaae8f345.mm.R.raw.f80702x5572fe59);
                    c12589x40ea1b77.f170386f.setImageResource(com.p314xaae8f345.mm.R.raw.f78504x8a35d882);
                } else if (1 == i17 || z18) {
                    java.lang.String string = bundle.getString("key_footer_icon", "");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(string, new jj1.d(c12589x40ea1b77, z18));
                    }
                }
                java.lang.String string2 = bundle.getString("key_footer_text", "");
                java.lang.String string3 = bundle.getString("key_footer_text_default", "");
                if (!string2.isEmpty()) {
                    c12589x40ea1b77.f170392o.setText(string2);
                } else if (!string3.isEmpty()) {
                    c12589x40ea1b77.f170392o.setText(string3);
                }
            }
        }
        if (z17 && !(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_group_todo_disable, 0) == 1)) {
            c12589x40ea1b77.f170388h.setVisibility(0);
        } else {
            c12589x40ea1b77.f170388h.setVisibility(8);
        }
        c12589x40ea1b77.f170394q = t0Var;
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(c12589x40ea1b77);
        }
        return c12589x40ea1b77;
    }
}
