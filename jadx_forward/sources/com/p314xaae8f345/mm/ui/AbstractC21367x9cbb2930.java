package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.FragmentActivitySupport */
/* loaded from: classes11.dex */
public abstract class AbstractC21367x9cbb2930 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: _hellAccFlag_ */
    private byte f39295x7f11beae;

    /* renamed from: fragmentIntent */
    public android.content.Intent f39296xa73a090c;

    /* renamed from: hasDestory */
    public boolean f39297xd5f7591a;

    /* renamed from: isCurrentActivity */
    public boolean f39298x5262fd1e;

    /* renamed from: mActivity */
    private p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f39299xc2499a9c;

    public AbstractC21367x9cbb2930(boolean z17) {
        this.f39297xd5f7591a = false;
        this.f39296xa73a090c = new android.content.Intent();
        this.f39298x5262fd1e = z17;
    }

    /* renamed from: findViewById */
    public android.view.View mo26077x4ff8c0f0(int i17) {
        android.view.View m7474xfb86a31b = m7474xfb86a31b();
        android.view.View findViewById = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(i17) : null;
        return findViewById != null ? findViewById : mo78409x676b27cd().findViewById(i17);
    }

    /* renamed from: getActivityLayoutInflater */
    public android.view.LayoutInflater m78382x7412b47a() {
        return mo78409x676b27cd().getLayoutInflater();
    }

    /* renamed from: getBooleanExtra */
    public java.lang.Boolean m78383x21a1233e(java.lang.String str, boolean z17) {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null) ? java.lang.Boolean.valueOf(mo78409x676b27cd().getIntent().getBooleanExtra(str, z17)) : java.lang.Boolean.valueOf(m7436x8619eaa0().getBoolean(str, z17));
    }

    /* renamed from: getByteArrayExtra */
    public byte[] m78384x89472155(java.lang.String str) {
        byte[] byteArrayExtra = (!this.f39298x5262fd1e || mo78409x676b27cd() == null) ? null : mo78409x676b27cd().getIntent().getByteArrayExtra(str);
        return (byteArrayExtra != null || m7436x8619eaa0() == null) ? byteArrayExtra : super.m7436x8619eaa0().getByteArray(str);
    }

    /* renamed from: getContentResolver */
    public android.content.ContentResolver m78385x607f9d69() {
        if (mo78409x676b27cd() != null) {
            return mo78409x676b27cd().getContentResolver();
        }
        return null;
    }

    /* renamed from: getIntExtra */
    public int m78386x9c19e6d7(java.lang.String str, int i17) {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null && mo78409x676b27cd() != null) ? mo78409x676b27cd().getIntent().getIntExtra(str, i17) : m7436x8619eaa0() != null ? m7436x8619eaa0().getInt(str, i17) : i17;
    }

    /* renamed from: getIntent */
    public android.content.Intent m78387x1e885992() {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null && mo78409x676b27cd() != null) ? mo78409x676b27cd().getIntent() : this.f39296xa73a090c;
    }

    /* renamed from: getLongExtra */
    public long m78388x5a3fc3e(java.lang.String str, long j17) {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null) ? mo78409x676b27cd().getIntent().getLongExtra(str, j17) : m7436x8619eaa0() != null ? m7436x8619eaa0().getLong(str, j17) : j17;
    }

    /* renamed from: getPackageName */
    public java.lang.String m78389x1000d6bb() {
        return mo78409x676b27cd().getPackageName();
    }

    /* renamed from: getParcelableExtra */
    public <T extends android.os.Parcelable> T m78390xba4c22b7(java.lang.String str) {
        T t17 = (!this.f39298x5262fd1e || mo78409x676b27cd() == null) ? null : (T) mo78409x676b27cd().getIntent().getParcelableExtra(str);
        return (t17 != null || m7436x8619eaa0() == null) ? t17 : (T) super.m7436x8619eaa0().getParcelable(str);
    }

    /* renamed from: getSharedPreferences */
    public android.content.SharedPreferences m78391xc8c7209d(java.lang.String str, int i17) {
        return mo78409x676b27cd().getSharedPreferences(str, i17);
    }

    /* renamed from: getStringArrayExtra */
    public java.lang.String[] m78392x7fc6439e(java.lang.String str) {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null) ? mo78409x676b27cd().getIntent().getStringArrayExtra(str) : m7436x8619eaa0().getStringArray(str);
    }

    /* renamed from: getStringArrayList */
    public java.util.ArrayList<java.lang.String> m78393x5ef8d750(java.lang.String str) {
        return (this.f39298x5262fd1e && m7436x8619eaa0() == null) ? mo78409x676b27cd().getIntent().getStringArrayListExtra(str) : m7436x8619eaa0().getStringArrayList(str);
    }

    /* renamed from: getStringExtra */
    public java.lang.String m78394x7e63ed49(java.lang.String str) {
        java.lang.String stringExtra = (!this.f39298x5262fd1e || mo78409x676b27cd() == null) ? null : mo78409x676b27cd().getIntent().getStringExtra(str);
        return (stringExtra != null || m7436x8619eaa0() == null) ? stringExtra : super.m7436x8619eaa0().getString(str);
    }

    /* renamed from: getWindow */
    public android.view.Window m78395x3622fee6() {
        if (mo78409x676b27cd() != null) {
            return mo78409x676b27cd().getWindow();
        }
        return null;
    }

    /* renamed from: getWindowManager */
    public android.view.WindowManager m78396x537339e7() {
        if (mo78409x676b27cd() != null) {
            return mo78409x676b27cd().getWindowManager();
        }
        return null;
    }

    /* renamed from: isFinishing */
    public boolean m78397x697ca065() {
        if (mo78409x676b27cd() == null) {
            return true;
        }
        return mo78409x676b27cd().isFinishing();
    }

    /* renamed from: isShowing */
    public boolean m78398x58a9c73b() {
        return !this.f39297xd5f7591a;
    }

    /* renamed from: managedQuery */
    public final android.database.Cursor m78399x30870469(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (mo78409x676b27cd() != null) {
            return mo78409x676b27cd().managedQuery(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        this.f39299xc2499a9c = mo7430x19263085();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        this.f39297xd5f7591a = true;
    }

    /* renamed from: openContextMenu */
    public void m78400x8c76df04(android.view.View view) {
        if (mo78409x676b27cd() != null) {
            mo78409x676b27cd().openContextMenu(view);
        }
    }

    /* renamed from: overridePendingTransition */
    public void m78401x4d12b7e0(int i17, int i18) {
        if (mo78409x676b27cd() != null) {
            mo78409x676b27cd().overridePendingTransition(i17, i18);
        }
    }

    /* renamed from: removeExtra */
    public void m78402xed145dec(java.lang.String str) {
        if (this.f39298x5262fd1e && m7436x8619eaa0() == null) {
            mo78409x676b27cd().getIntent().removeExtra(str);
        } else if (m7436x8619eaa0() != null) {
            m7436x8619eaa0().remove(str);
        }
    }

    /* renamed from: sendBroadcast */
    public void m78403xabdb3219(android.content.Intent intent) {
        mo78409x676b27cd().sendBroadcast(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setArguments */
    public void mo7562xe26dab14(android.os.Bundle bundle) {
        super.mo7562xe26dab14(bundle);
        this.f39296xa73a090c.putExtras(bundle);
    }

    /* renamed from: setBooleanExtra */
    public void m78404x57ea1e4a(java.lang.String str, boolean z17) {
        if (this.f39298x5262fd1e && m7436x8619eaa0() == null) {
            mo78409x676b27cd().getIntent().putExtra(str, z17);
        } else if (m7436x8619eaa0() != null) {
            m7436x8619eaa0().putBoolean(str, z17);
        }
    }

    /* renamed from: setRequestedOrientation */
    public void m78405xf1bfa104(int i17) {
        if (mo78409x676b27cd() != null) {
            mo78409x676b27cd().setRequestedOrientation(i17);
        }
    }

    /* renamed from: setResult */
    public void m78406x209a1f1f(int i17) {
        if (this.f39298x5262fd1e) {
            mo78409x676b27cd().setResult(i17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: startActivity */
    public void mo7585xa4df9991(android.content.Intent intent) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd = mo78409x676b27cd();
        if (mo78409x676b27cd != null) {
            mo78409x676b27cd.mo7603xcc5c304b(this, intent, -1);
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: startFragment */
    public void m78408xa53688d2(java.lang.Class<?> cls, android.content.Intent intent) {
        if (this.f39298x5262fd1e) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo7585xa4df9991((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: thisActivity */
    public p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd() {
        if (this.f39299xc2499a9c == null) {
            this.f39299xc2499a9c = mo7430x19263085();
        }
        return this.f39299xc2499a9c;
    }

    /* renamed from: setResult */
    public void m78407x209a1f1f(int i17, android.content.Intent intent) {
        if (this.f39298x5262fd1e) {
            mo78409x676b27cd().setResult(i17);
        } else {
            mo78409x676b27cd().setResult(i17, intent);
        }
    }

    public AbstractC21367x9cbb2930() {
        this.f39297xd5f7591a = false;
        this.f39296xa73a090c = new android.content.Intent();
        this.f39298x5262fd1e = false;
    }
}
