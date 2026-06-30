package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI */
/* loaded from: classes15.dex */
public class ActivityC18840xef9a7fc2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 implements fq4.s {
    public static final /* synthetic */ int F = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e A;

    /* renamed from: x, reason: collision with root package name */
    public fq4.t f257726x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f257728z;

    /* renamed from: y, reason: collision with root package name */
    public fq4.y f257727y = null;
    public android.widget.Button B = null;
    public int C = 1;
    public int D = 0;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6223x8faa8c7b>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.1
        {
            this.f39173x3fe91575 = 438744715;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6223x8faa8c7b c6223x8faa8c7b) {
            boolean z17 = c6223x8faa8c7b.f136470g.f89218a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc2 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.this;
            if (z17) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.F;
                activityC18840xef9a7fc2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11390, 4);
                java.lang.String str = fq4.e0.f347124a;
                if (str == null) {
                    str = v61.d.a(1);
                }
                java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 4)};
                java.util.HashMap hashMap = new java.util.HashMap(2);
                for (int i18 = 0; i18 < 2; i18++) {
                    java.util.Map.Entry entry = entryArr[i18];
                    java.lang.Object key = entry.getKey();
                    java.util.Objects.requireNonNull(key);
                    java.lang.Object value = entry.getValue();
                    java.util.Objects.requireNonNull(value);
                    if (hashMap.put(key, value) != null) {
                        throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                    }
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e c18837xd1ecdd0e = activityC18840xef9a7fc2.A;
                android.widget.ProgressBar progressBar = c18837xd1ecdd0e.f257715d;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                c18837xd1ecdd0e.f257716e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k_1);
                c18837xd1ecdd0e.f257717f.setVisibility(0);
            } else {
                android.view.View view = activityC18840xef9a7fc2.f257728z;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = activityC18840xef9a7fc2.f257699f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e c18837xd1ecdd0e2 = activityC18840xef9a7fc2.A;
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.s(activityC18840xef9a7fc2);
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(200L);
                translateAnimation.setFillAfter(true);
                translateAnimation.setRepeatCount(0);
                translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.e1(sVar));
                c18837xd1ecdd0e2.startAnimation(translateAnimation);
            }
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void V6() {
        this.f257726x = new fq4.t(this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f257701h.m72729xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.k_3);
        this.f257701h.f257759f.setVisibility(8);
        this.f257698e.setEnabled(false);
        this.f257727y = new fq4.y();
        this.f257728z = findViewById(com.p314xaae8f345.mm.R.id.p5_);
        this.A = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e) findViewById(com.p314xaae8f345.mm.R.id.jbx);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.m3m);
        this.B = button;
        button.setVisibility(8);
        this.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.q(this));
        this.A.m72721xda0cc226(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.r(this));
        mo74406x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.F;
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc2 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.this;
                activityC18840xef9a7fc2.a7();
                fq4.y yVar = activityC18840xef9a7fc2.f257727y;
                yVar.f347186a.mo166726xad07d6f3();
                yVar.f347187b.d();
                activityC18840xef9a7fc2.finish();
                return true;
            }
        }, com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        this.E.mo48813x58998cd();
        b7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00
    public void W6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f257704n)) {
            return;
        }
        this.f257698e.setEnabled(false);
        X6();
        int i17 = this.C;
        if (i17 == 1) {
            fq4.t tVar = this.f257726x;
            fq4.i iVar = new fq4.i(this.f257704n, 71, tVar.f347177f, 0);
            iVar.f347139h = true;
            c01.d9.e().g(iVar);
            tVar.f347175d = 71;
            return;
        }
        if (i17 == 2) {
            fq4.t tVar2 = this.f257726x;
            fq4.i iVar2 = new fq4.i(this.f257704n, 72, tVar2.f347177f, tVar2.f347178g);
            iVar2.f347139h = true;
            c01.d9.e().g(iVar2);
            tVar2.f347175d = 72;
        }
    }

    public void Z6(boolean z17, int i17) {
        int i18 = 0;
        if (z17) {
            if (i17 == 71) {
                this.f257698e.setEnabled(false);
                this.C = 2;
                U6();
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.g1.b(this.f257701h, this, new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.t(this));
                return;
            }
            if (i17 != 72) {
                return;
            }
            this.D = 0;
            java.lang.String str = fq4.e0.f347124a;
            if (str == null) {
                str = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 0)};
            java.util.HashMap hashMap = new java.util.HashMap(2);
            for (int i19 = 0; i19 < 2; i19++) {
                java.util.Map.Entry entry = entryArr[i19];
                java.lang.Object key = entry.getKey();
                java.util.Objects.requireNonNull(key);
                java.lang.Object value = entry.getValue();
                java.util.Objects.requireNonNull(value);
                if (hashMap.put(key, value) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KIsCreateSuccess", true);
            setResult(-1, intent);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.class);
            intent2.putExtra("kscene_type", 72);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            return;
        }
        if (i17 != 72) {
            return;
        }
        a7();
        int i27 = this.D + 1;
        this.D = i27;
        if (i27 < 2) {
            this.f257698e.setEnabled(true);
            T6();
            this.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k_5);
            this.f257701h.c();
            java.lang.String str2 = fq4.e0.f347124a;
            if (str2 == null) {
                str2 = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 2)};
            java.util.HashMap hashMap2 = new java.util.HashMap(2);
            while (i18 < 2) {
                java.util.Map.Entry entry2 = entryArr2[i18];
                java.lang.Object key2 = entry2.getKey();
                java.util.Objects.requireNonNull(key2);
                java.lang.Object value2 = entry2.getValue();
                java.util.Objects.requireNonNull(value2);
                if (hashMap2.put(key2, value2) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
                }
                i18++;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
            return;
        }
        this.D = 0;
        android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e.class);
        intent3.putExtra("kscene_type", 75);
        startActivityForResult(intent3, 1);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        java.lang.String str3 = fq4.e0.f347124a;
        if (str3 == null) {
            str3 = v61.d.a(1);
        }
        java.util.Map.Entry[] entryArr3 = {new java.util.AbstractMap.SimpleEntry("voicelock_sessionid", str3), new java.util.AbstractMap.SimpleEntry("voicelock_create_event_type", 3)};
        java.util.HashMap hashMap3 = new java.util.HashMap(2);
        while (i18 < 2) {
            java.util.Map.Entry entry3 = entryArr3[i18];
            java.lang.Object key3 = entry3.getKey();
            java.util.Objects.requireNonNull(key3);
            java.lang.Object value3 = entry3.getValue();
            java.util.Objects.requireNonNull(value3);
            if (hashMap3.put(key3, value3) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key3);
            }
            i18++;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_create_process_end", java.util.Collections.unmodifiableMap(hashMap3), 34575);
        finish();
    }

    public final void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KIsCreateSuccess", false);
        setResult(-1, intent);
    }

    public final void b7() {
        fq4.y yVar = this.f257727y;
        yVar.f347186a.mo166726xad07d6f3();
        yVar.f347187b.d();
        yVar.f347188c = 0;
        yVar.f347189d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18837xd1ecdd0e c18837xd1ecdd0e = this.A;
        android.widget.ProgressBar progressBar = c18837xd1ecdd0e.f257715d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        c18837xd1ecdd0e.f257716e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k9x);
        c18837xd1ecdd0e.f257717f.setVisibility(8);
        android.view.View view = this.f257728z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f257699f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(0);
        fq4.y yVar2 = this.f257727y;
        yVar2.f347186a.mo166726xad07d6f3();
        yVar2.f347187b.d();
        yVar2.f347188c = 0;
        yVar2.f347189d = 0;
        java.lang.String a17 = fq4.u.a("voice_pt_voice_print_noise_detect.rec", true);
        w21.k0 k0Var = yVar2.f347186a;
        if (!k0Var.mo166725x8e35cb53(a17)) {
            k0Var.mo166726xad07d6f3();
            k0Var.mo166726xad07d6f3();
            yVar2.f347187b.d();
            yVar2.f347188c = 0;
            yVar2.f347189d = 0;
        }
        yVar2.f347187b.c(100L, 100L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        a7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.t tVar = this.f257726x;
        tVar.getClass();
        c01.d9.e().q(611, tVar);
        c01.d9.e().q(612, tVar);
        tVar.f347179h = null;
        this.E.mo48814x2efc64();
    }
}
