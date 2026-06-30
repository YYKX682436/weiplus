package hq5;

/* loaded from: classes5.dex */
public final class t0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364805e;

    /* renamed from: f, reason: collision with root package name */
    public final int f364806f;

    /* renamed from: g, reason: collision with root package name */
    public long f364807g;

    /* renamed from: h, reason: collision with root package name */
    public final long f364808h;

    /* renamed from: i, reason: collision with root package name */
    public final long f364809i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f364810m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f364811n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364804d = "MicroMsg.WeDrop.WeDropSelectFileUIC";
        this.f364805e = 10001;
        this.f364806f = 10002;
        long qj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.f2f.C20146x1a65fac9());
        this.f364808h = qj6 < 1073741824 ? 1073741824L : qj6;
        long qj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.f2f.C20147xf85a95ac());
        this.f364809i = qj7 >= 1073741824 ? qj7 : 1073741824L;
        this.f364810m = jz5.h.b(new hq5.l0(this));
    }

    public final em.k4 T6() {
        return (em.k4) ((jz5.n) this.f364810m).mo141623x754a37bb();
    }

    public final void U6(int i17, android.content.Intent intent) {
        int i18;
        java.lang.String str = this.f364804d;
        if (i17 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "select file result code: " + i17);
            return;
        }
        java.util.List stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("selected_file_lst") : null;
        java.util.List list = kz5.p0.f395529d;
        java.util.List list2 = stringArrayListExtra == null ? list : stringArrayListExtra;
        java.util.List stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("selected_file_title_lst") : null;
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "select file count: " + list2.size() + ", title count: " + list.size());
        if ((!list2.isEmpty()) && (!list.isEmpty()) && list2.size() == list.size()) {
            W6();
            android.content.ContentResolver contentResolver = m80379x76847179().getContentResolver();
            java.util.Iterator it = list2.iterator();
            while (true) {
                i18 = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                try {
                    if (r26.i0.A(str2, "content://", false, 2, null)) {
                        android.net.Uri parse = android.net.Uri.parse(str2);
                        contentResolver.takePersistableUriPermission(parse, 1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "take persistable uri permission: " + parse);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "take persistable uri permission error: " + e17);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long j17 = 0;
            for (java.lang.Object obj : list2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str3 = (java.lang.String) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                eq5.a aVar = new eq5.a(str3, r45.z77.File, com.p314xaae8f345.mm.vfs.w6.k(str3));
                java.lang.String str4 = (java.lang.String) list.get(i18);
                if (str4 == null) {
                    str4 = "";
                }
                aVar.f337442d = str4;
                java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getFileExt(...)");
                aVar.f337443e = n17;
                j17 += aVar.f337441c;
                arrayList.add(aVar);
                i18 = i19;
            }
            cq5.i.f303076a.f(java.lang.System.currentTimeMillis() - this.f364807g, arrayList.size(), 0, 0, j17, cq5.c.f303043f);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.g(arrayList, j17));
            }
            jq5.b bVar = jq5.b.f382788a;
            kz5.r0 r0Var = kz5.r0.f395535d;
            bVar.a(r0Var, r0Var);
        }
    }

    public final void V6(java.util.List list, java.util.List list2, boolean z17) {
        W6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            eq5.a aVar = new eq5.a(str, r45.z77.Image, com.p314xaae8f345.mm.vfs.w6.k(str));
            j17 += aVar.f337441c;
            arrayList.add(aVar);
        }
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            eq5.a aVar2 = new eq5.a(str2, r45.z77.Video, com.p314xaae8f345.mm.vfs.w6.k(str2));
            j17 += aVar2.f337441c;
            arrayList.add(aVar2);
        }
        cq5.i.f303076a.f(java.lang.System.currentTimeMillis() - this.f364807g, 0, list2.size(), list.size(), j17, z17 ? cq5.c.f303044g : cq5.c.f303042e);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.g(arrayList, j17));
        }
        jq5.b.f382788a.a(kz5.n0.X0(list), kz5.n0.X0(list2));
    }

    public final void W6() {
        if (this.f364811n == null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.f293313g = 2;
            e4Var.f293309c = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
            e4Var.f293312f = true;
            e4Var.f293311e = false;
            this.f364811n = e4Var.c();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if (i17 != this.f364805e) {
            if (i17 == this.f364806f) {
                U6(i18, intent);
                return;
            }
            return;
        }
        java.util.List stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        java.util.List list = kz5.p0.f395529d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = list;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364804d, "select image count: " + stringArrayListExtra.size() + ", video count: " + list.size());
        if ((!stringArrayListExtra.isEmpty()) || (!list.isEmpty())) {
            V6(stringArrayListExtra, list, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.m0(this));
        }
    }
}
