package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class z implements kv.f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f70576c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.modelavatar.a f70577d;

    /* renamed from: e, reason: collision with root package name */
    public static final bm5.p1 f70578e;

    /* renamed from: a, reason: collision with root package name */
    public final l75.v0 f70579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f70580b;

    static {
        com.tencent.mm.modelavatar.y yVar = new com.tencent.mm.modelavatar.y(null);
        f70576c = yVar;
        yVar.put("voipapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_voip));
        yVar.put("qqmail", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_qqmail));
        yVar.put("fmessage", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_fmessage));
        yVar.put("floatbottle", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_bottle));
        yVar.put("lbsapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_nearby));
        yVar.put("shakeapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_shake));
        yVar.put("medianote", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_medianote));
        yVar.put("qqfriend", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_qqfriend));
        yVar.put("masssendapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_masssend_regular));
        yVar.put("feedsapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_feedsapp));
        yVar.put("facebookapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_facebookapp));
        yVar.put("newsapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_readerapp));
        yVar.put("helper_entry", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_plugin_icon_contract));
        yVar.put("voicevoipapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_voicevoip));
        yVar.put("voiceinputapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_voiceinput));
        yVar.put("findersayhisessionholder", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.icon_filled_nearby_finder));
        yVar.put("textstatussayhisessionholder", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.icon_filled_nearby_text_status));
        yVar.put("officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_brand_contact_new));
        yVar.put("service_officialaccounts", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_servicebrand_contact));
        yVar.put("linkedinplugin", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_linkedin));
        yVar.put("notifymessage", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_notify_message_contact));
        yVar.put("appbrandcustomerservicemsg", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bvo));
        yVar.put("appbrand_notify_message", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_app_brand_notify_msg));
        yVar.put("downloaderapp", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_downloaderapp));
        yVar.put("finderaliassessionholder", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_finder_msg_alias_holder));
        yVar.put("opencustomerservicemsg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_open_im_kefu_service));
        yVar.put("conversationboxservice", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_chatroom_box));
        yVar.put("message_fold", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_stick_on));
        yVar.put("schedule_message", java.lang.Integer.valueOf(com.tencent.mm.R.raw.default_schedule_message));
        yVar.put("1@fackuser", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.icon));
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>() { // from class: com.tencent.mm.modelavatar.AvatarStorage$MMTrimMemoryEventListener
            {
                com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AvatarStorage", "received MMTrimMemoryEvent: AvatarStorage");
                if (com.tencent.mm.modelavatar.z.f70577d != null && ih.a.f(e42.d0.clicfg_matrix_trim_memory_avatar_cache, false)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AvatarStorage", "received MMTrimMemoryEvent: clear [cacheMap][%s]", java.lang.Integer.valueOf(com.tencent.mm.modelavatar.z.f70577d.f70422a.size()));
                    com.tencent.mm.modelavatar.z.f70577d.f70422a.d(30);
                }
                return false;
            }
        }.alive();
        f70577d = new com.tencent.mm.modelavatar.a(100);
        f70578e = new com.tencent.mm.modelavatar.u();
    }

    public z() {
        com.tencent.mm.modelavatar.s sVar = new com.tencent.mm.modelavatar.s(this);
        this.f70579a = sVar;
        this.f70580b = new java.util.ArrayList();
        com.tencent.mm.modelavatar.t tVar = new com.tencent.mm.modelavatar.t(this);
        if (f70577d == null) {
            f70577d = new com.tencent.mm.modelavatar.a(100);
        }
        sVar.a(tVar, null);
    }

    public static void e(android.content.Context context, android.widget.ImageView imageView, int i17) {
        try {
            imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bp.b.decodeResource(context.getResources(), i17, null), true, 1.0f));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public static boolean f(android.graphics.Bitmap bitmap) {
        return (bitmap == null || bitmap.isRecycled()) ? false : true;
    }

    public static java.lang.StringBuilder g(java.lang.StringBuilder sb6, java.lang.String str, boolean z17) {
        java.lang.String g17 = kk.k.g(str.getBytes());
        sb6.append(g17.substring(0, 2));
        sb6.append('/');
        sb6.append(g17.substring(2, 4));
        sb6.append('/');
        sb6.append("user_");
        if (z17) {
            sb6.append("hd_");
        }
        sb6.append(g17);
        sb6.append(".png");
        return sb6;
    }

    public static android.graphics.Bitmap h(java.lang.String str, java.lang.String str2, boolean z17) {
        int width;
        int height;
        android.graphics.Bitmap L = com.tencent.mm.vfs.w6.j(str) ? z17 ? com.tencent.mm.sdk.platformtools.x.L(str, com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p(), com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p()) : com.tencent.mm.sdk.platformtools.x.J(str, null) : null;
        if (L == null) {
            L = com.tencent.mm.modelavatar.x.a(str, str2);
        }
        if (f(L) && (width = L.getWidth()) != (height = L.getHeight())) {
            if (width > height) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf((width - height) / 2));
                arrayList.add(L);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/modelavatar/AvatarStorage", "getAvatarFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                L = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, L, "com/tencent/mm/modelavatar/AvatarStorage", "getAvatarFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf((height - width) / 2));
                arrayList2.add(0);
                arrayList2.add(L);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/modelavatar/AvatarStorage", "getAvatarFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                L = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, L, "com/tencent/mm/modelavatar/AvatarStorage", "getAvatarFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            }
        }
        if (f(L)) {
            return L;
        }
        return null;
    }

    public void d(kv.e0 e0Var) {
        synchronized (this.f70580b) {
            ((java.util.ArrayList) this.f70580b).add(new java.lang.ref.WeakReference(e0Var));
        }
    }

    public java.lang.String i(java.lang.String str, boolean z17, boolean z18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append(gm0.j1.u().h());
        sb6.append("avatar/");
        g(sb6, str, z17);
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(sb7))) {
            return sb7;
        }
        return null;
    }

    public java.lang.String j(java.lang.String str, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        sb6.append("wcf://avatar/");
        g(sb6, str, z17);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(sb7));
        return sb7;
    }

    public android.graphics.Bitmap k(android.content.Context context) {
        context.getResources();
        android.graphics.Bitmap l17 = l("I_AM_NO_SDCARD_USER_NAME");
        if (f(l17) || l17 == null) {
            return l17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarStorage", "not cached, recycled=%b, reload=%s", java.lang.Boolean.valueOf(l17.isRecycled()), "I_AM_NO_SDCARD_USER_NAME");
        android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(l17, true, 1.0f);
        s("I_AM_NO_SDCARD_USER_NAME", s07);
        return s07;
    }

    public android.graphics.Bitmap l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f70577d.f70422a.i(str);
        if (bitmap == null) {
            if (!str.startsWith("key")) {
                bitmap = (android.graphics.Bitmap) f70577d.f70422a.i(((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Zi(str, 0.1f));
            }
            if (bitmap == null) {
                return null;
            }
        }
        if (!bitmap.isRecycled()) {
            return bitmap;
        }
        f70577d.f70422a.remove(str);
        return null;
    }

    public android.graphics.Bitmap m(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.x.j0(j(str, true), kv.f0.a(), kv.f0.a(), 0.0f);
    }

    public final java.lang.ref.WeakReference n(kv.e0 e0Var) {
        kv.e0 e0Var2;
        synchronized (this.f70580b) {
            for (int i17 = 0; i17 < ((java.util.ArrayList) this.f70580b).size(); i17++) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f70580b).get(i17);
                if (weakReference != null && (e0Var2 = (kv.e0) weakReference.get()) != null && e0Var2.equals(e0Var)) {
                    return weakReference;
                }
            }
            return null;
        }
    }

    public boolean o(java.lang.String str, boolean z17) {
        java.lang.String j17 = j(str, z17);
        return com.tencent.mm.vfs.w6.j(j17) || (!z17 && com.tencent.mm.vfs.w6.j(j17.concat(".bm")));
    }

    public boolean p(java.lang.String str, boolean z17) {
        java.lang.String j17 = j(str, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarStorage", "Removed avatar: %s, hd: %b, path: %s", str, java.lang.Boolean.valueOf(z17), j17);
        boolean h17 = com.tencent.mm.vfs.w6.h(j17);
        if (z17) {
            return h17;
        }
        com.tencent.mm.modelavatar.x.b(j17);
        return h17 | true;
    }

    public void q(kv.e0 e0Var) {
        synchronized (this.f70580b) {
            java.lang.ref.WeakReference n17 = n(e0Var);
            if (n17 != null) {
                ((java.util.ArrayList) this.f70580b).remove(n17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap r(java.lang.String r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.z.r(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    public void s(java.lang.String str, android.graphics.Bitmap bitmap) {
        f70577d.f70422a.j(str, bitmap);
        u45.f fVar = (u45.f) f70578e.b();
        if (fVar != null) {
            ((va3.m0) fVar).wi(str);
        }
        l75.v0 v0Var = this.f70579a;
        v0Var.d(str);
        v0Var.c();
    }

    public boolean t(java.lang.String str, android.graphics.Bitmap bitmap) {
        return u(str, bitmap, 156, 156, 1);
    }

    public boolean u(java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        android.graphics.Bitmap createScaledBitmap;
        android.graphics.Bitmap createBitmap;
        android.graphics.Bitmap bitmap2 = bitmap;
        if (!f(bitmap)) {
            return false;
        }
        if (bitmap.getWidth() == i18 && bitmap.getHeight() == i17) {
            createScaledBitmap = bitmap2;
        } else {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != height) {
                    if (width > height) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(height));
                        arrayList.add(java.lang.Integer.valueOf(height));
                        arrayList.add(0);
                        arrayList.add(java.lang.Integer.valueOf((width - height) / 2));
                        arrayList.add(bitmap2);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/modelavatar/AvatarStorage", "updateAvatar", "(Ljava/lang/String;Landroid/graphics/Bitmap;III)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                        createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                        yj0.a.e(obj, createBitmap, "com/tencent/mm/modelavatar/AvatarStorage", "updateAvatar", "(Ljava/lang/String;Landroid/graphics/Bitmap;III)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(width));
                        arrayList2.add(java.lang.Integer.valueOf(width));
                        arrayList2.add(java.lang.Integer.valueOf((height - width) / 2));
                        arrayList2.add(0);
                        arrayList2.add(bitmap2);
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/modelavatar/AvatarStorage", "updateAvatar", "(Ljava/lang/String;Landroid/graphics/Bitmap;III)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                        createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/modelavatar/AvatarStorage", "updateAvatar", "(Ljava/lang/String;Landroid/graphics/Bitmap;III)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    }
                    createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, i18, i17, true);
                } else {
                    createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, i18, i17, true);
                }
            } catch (java.lang.OutOfMemoryError unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AvatarStorage", "kevin updateAvatar fail  %s ", str);
                if (f(bitmap)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvatarStorage", "recycle bitmap:%s", bitmap.toString());
                    bitmap.recycle();
                }
                return false;
            }
        }
        if (createScaledBitmap != null && createScaledBitmap != bitmap2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarStorage", "recycle bitmap:%s", bitmap.toString());
            bitmap.recycle();
            bitmap2 = createScaledBitmap;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.o0(j(str, false), new com.tencent.mm.modelavatar.v(this, bitmap2));
            s(str, bitmap2);
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarStorage", e17, "Failed to save avatar: %s", str);
            return false;
        }
    }

    public boolean v(java.lang.String str, byte[] bArr) {
        android.graphics.Bitmap r17 = r(str, bArr);
        if (!f(r17)) {
            return false;
        }
        s(str, r17);
        return true;
    }
}
