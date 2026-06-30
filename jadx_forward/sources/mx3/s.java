package mx3;

/* loaded from: classes10.dex */
public final class s {
    public s(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void a(mx3.s sVar, android.app.Activity context, int i17, java.lang.String username, int i18, boolean z17, vx3.i iVar, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i19 & 32) != 0) {
            iVar = null;
        }
        vx3.i iVar2 = iVar;
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((hy2.f) ((iz2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(iz2.b.class))).O6(7, new mx3.l(i17, i18, username, iVar2, context, z18));
    }

    public final void b(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_channel", i17);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17236x66d07b59.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSettingUI", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSettingUI", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.Object c(int i17, int i18, t45.l0 l0Var, int i19, int i27, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str3;
        int i28 = l0Var.f497134d;
        xx3.h hVar = xx3.h.f539557a;
        if (i28 != 2) {
            t45.e0 e0Var = l0Var.f497137g;
            return e0Var != null ? hVar.c(i17, i18, 0L, "", i19, i27, str, e0Var.f497080d, str2, interfaceC29045xdcb5ca57) : new rm0.i(false, null, 2, null);
        }
        t45.f fVar = l0Var.f497138h;
        if (fVar != null) {
            return (fVar == null || (str3 = fVar.f497083e) == null) ? new rm0.i(false, null, 2, null) : xx3.h.d(hVar, i17, i18, fVar.f497082d, str3, i19, i27, str, 0, str2, interfaceC29045xdcb5ca57, 128, null);
        }
        return new rm0.i(false, null, 2, null);
    }

    public final java.lang.Object d(int i17, int i18, t45.l0 l0Var, int i19, int i27, int i28, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str2;
        int i29 = l0Var.f497134d;
        xx3.h hVar = xx3.h.f539557a;
        if (i29 != 2) {
            t45.e0 e0Var = l0Var.f497137g;
            return e0Var != null ? hVar.e(i17, i18, e0Var.f497080d, 0L, "", i19, i27, i28, str, interfaceC29045xdcb5ca57) : new rm0.i(false, null, 2, null);
        }
        t45.f fVar = l0Var.f497138h;
        if (fVar != null) {
            return (fVar == null || (str2 = fVar.f497083e) == null) ? new rm0.i(false, null, 2, null) : hVar.e(i17, i18, 0, fVar.f497082d, str2, i19, i27, i28, str, interfaceC29045xdcb5ca57);
        }
        return new rm0.i(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(vx3.i r18, java.lang.String r19, boolean r20, java.lang.String r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx3.s.e(vx3.i, java.lang.String, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
