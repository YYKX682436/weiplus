package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public long f257781d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f257782e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 f257783f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00) {
        this.f257783f = abstractActivityC18835xbdcc0e00;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        long elapsedRealtime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f257783f.mo55332x76847179();
            java.lang.String string = this.f257783f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0y);
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(mo55332x76847179, "android.permission.RECORD_AUDIO", 80, "", string);
            this.f257782e = a17;
            if (!a17) {
                yj0.a.i(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00 = this.f257783f;
            abstractActivityC18835xbdcc0e00.f257703m = false;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC18835xbdcc0e00.f257705o)) {
                this.f257781d = java.lang.System.currentTimeMillis();
                this.f257783f.f257697d.setPressed(true);
                this.f257783f.U6();
                this.f257783f.f257712v.mo50307xb9e94560(1, 300L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseVoicePrintUI", "mic press down");
            }
        } else if (action == 1 || action == 3) {
            if (!this.f257782e) {
                yj0.a.i(true, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            this.f257783f.f257697d.setPressed(false);
            this.f257783f.f257712v.mo50303x856b99f0(1);
            if (java.lang.System.currentTimeMillis() - this.f257781d < 300) {
                this.f257783f.f257703m = false;
            } else {
                this.f257783f.f257703m = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseVoicePrintUI", "mic press up %d, hasTouchDown:%b", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Boolean.valueOf(this.f257783f.f257703m));
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 c18846x292f7cd4 = this.f257783f.f257700g;
            c18846x292f7cd4.f257755p = false;
            c18846x292f7cd4.f257754o = -1.0f;
            c18846x292f7cd4.f257756q = false;
            c18846x292f7cd4.f257753n = 0.0f;
            c18846x292f7cd4.postInvalidate();
            c18846x292f7cd4.f257756q = false;
            c18846x292f7cd4.f257750h.d();
            c18846x292f7cd4.postInvalidate();
            this.f257783f.f257710t.d();
            fq4.d0 d0Var = this.f257783f.f257702i;
            d0Var.f347118f.C(false);
            d0Var.f347117e = false;
            synchronized (d0Var) {
                w21.k0 k0Var = d0Var.f347113a;
                if (k0Var != null) {
                    k0Var.mo166726xad07d6f3();
                }
            }
            if (d0Var.f347116d != 2) {
                d0Var.f347114b = null;
                d0Var.f347117e = false;
            } else {
                long j17 = d0Var.f347115c;
                if (j17 <= 0) {
                    elapsedRealtime = 0;
                } else {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                }
                if (((int) elapsedRealtime) < 1000) {
                    d0Var.f347114b = "";
                    d0Var.f347117e = false;
                } else {
                    d0Var.f347117e = true;
                }
                d0Var.f347114b = "";
            }
            d0Var.f347116d = -1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e002 = this.f257783f;
            if (abstractActivityC18835xbdcc0e002.f257703m) {
                if (!abstractActivityC18835xbdcc0e002.f257702i.f347117e) {
                    abstractActivityC18835xbdcc0e002.f257711u.d();
                    abstractActivityC18835xbdcc0e002.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9t);
                    abstractActivityC18835xbdcc0e002.f257701h.c();
                    abstractActivityC18835xbdcc0e002.f257704n = null;
                    if (abstractActivityC18835xbdcc0e002.f257708r) {
                        java.lang.String str = fq4.e0.f347124a;
                        if (str == null) {
                            str = v61.d.a(1);
                        }
                        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 2)};
                        java.util.HashMap hashMap = new java.util.HashMap(2);
                        for (int i17 = 0; i17 < 2; i17++) {
                            java.util.Map.Entry entry = entryArr[i17];
                            java.lang.Object key = entry.getKey();
                            java.util.Objects.requireNonNull(key);
                            java.lang.Object value = entry.getValue();
                            java.util.Objects.requireNonNull(value);
                            if (hashMap.put(key, value) != null) {
                                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                            }
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
                    } else {
                        java.lang.String str2 = fq4.e0.f347124a;
                        if (str2 == null) {
                            str2 = v61.d.a(1);
                        }
                        java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 1)};
                        java.util.HashMap hashMap2 = new java.util.HashMap(2);
                        for (int i18 = 0; i18 < 2; i18++) {
                            java.util.Map.Entry entry2 = entryArr2[i18];
                            java.lang.Object key2 = entry2.getKey();
                            java.util.Objects.requireNonNull(key2);
                            java.lang.Object value2 = entry2.getValue();
                            java.util.Objects.requireNonNull(value2);
                            if (hashMap2.put(key2, value2) != null) {
                                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
                            }
                        }
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
                    }
                }
                android.view.View view2 = abstractActivityC18835xbdcc0e002.f257699f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "releaseMic", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                abstractActivityC18835xbdcc0e002.f257701h.d();
                abstractActivityC18835xbdcc0e002.f257701h.m72728x63103da6(abstractActivityC18835xbdcc0e002.f257705o);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257783f.f257704n)) {
                    this.f257783f.W6();
                }
                this.f257781d = 0L;
                this.f257783f.f257703m = false;
            } else {
                abstractActivityC18835xbdcc0e002.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9t);
                this.f257783f.f257701h.c();
                if (this.f257783f.f257708r) {
                    java.lang.String str3 = fq4.e0.f347124a;
                    if (str3 == null) {
                        str3 = v61.d.a(1);
                    }
                    java.util.Map.Entry[] entryArr3 = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str3), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 2)};
                    java.util.HashMap hashMap3 = new java.util.HashMap(2);
                    for (int i19 = 0; i19 < 2; i19++) {
                        java.util.Map.Entry entry3 = entryArr3[i19];
                        java.lang.Object key3 = entry3.getKey();
                        java.util.Objects.requireNonNull(key3);
                        java.lang.Object value3 = entry3.getValue();
                        java.util.Objects.requireNonNull(value3);
                        if (hashMap3.put(key3, value3) != null) {
                            throw new java.lang.IllegalArgumentException("duplicate key: " + key3);
                        }
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap3), 34575);
                } else {
                    java.lang.String str4 = fq4.e0.f347124a;
                    if (str4 == null) {
                        str4 = v61.d.a(1);
                    }
                    java.util.Map.Entry[] entryArr4 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str4), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 1)};
                    java.util.HashMap hashMap4 = new java.util.HashMap(2);
                    for (int i27 = 0; i27 < 2; i27++) {
                        java.util.Map.Entry entry4 = entryArr4[i27];
                        java.lang.Object key4 = entry4.getKey();
                        java.util.Objects.requireNonNull(key4);
                        java.lang.Object value4 = entry4.getValue();
                        java.util.Objects.requireNonNull(value4);
                        if (hashMap4.put(key4, value4) != null) {
                            throw new java.lang.IllegalArgumentException("duplicate key: " + key4);
                        }
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap4), 34575);
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
