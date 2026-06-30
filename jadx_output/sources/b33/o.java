package b33;

/* loaded from: classes8.dex */
public final class o extends b33.i implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, xg5.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f17677f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f17678g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f17677f = new java.util.ArrayList();
    }

    public final void V6(int i17, yz5.l callback) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Iterator it = this.f17677f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i17 == ((java.lang.Number) ((jz5.l) obj).f302833d).intValue()) {
                    break;
                }
            }
        }
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = lVar != null ? (com.tencent.mm.ui.vas.VASCommonFragment) lVar.f302834e : null;
        if (vASCommonFragment == null) {
            callback.invoke(null);
            return;
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
        if (vASActivity == null) {
            vASCommonFragment.q0(new b33.j(callback, vASCommonFragment));
        } else {
            kotlin.jvm.internal.o.e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.ui.gallery.BaseMediaTabActivity");
            callback.invoke((com.tencent.mm.ui.gallery.BaseMediaTabActivity) vASActivity);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f17678g;
        boolean z17 = false;
        if (vASCommonFragment != null && (vASActivity = vASCommonFragment.f211121p) != null) {
            vASActivity.onBackPressed();
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaPickerUIC", "onBackPressed, consume result=" + z17);
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.tencent.mm.ui.vas.VASCommonFragment] */
    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment;
        com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaPickerUIC", "onCreate");
        android.content.Intent intent = getActivity().getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("MediaTabTypeList");
        kotlin.jvm.internal.o.e(intArrayExtra, "null cannot be cast to non-null type kotlin.IntArray");
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f17677f;
            if (i17 >= length) {
                break;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            android.content.Intent intent2 = new android.content.Intent();
            android.os.Bundle bundleExtra = intent.getBundleExtra("MediaTabTypeList" + i19);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            intent2.putExtras(bundleExtra);
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            if (i19 != 1) {
                if (i19 == 2) {
                    int i28 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
                    com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment3 = (com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment) lk5.q0.a(com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class, intent2, false, false, false, com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment.class, 28, null);
                    mediaTabFragment3.S = true;
                    mediaTabFragment2 = mediaTabFragment3;
                } else if (i19 == 3) {
                    int i29 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
                    intent2.setClass(context, com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.class);
                    intent2.putExtra("album_show_footerbar", false);
                    intent2.putExtra("album_select_only", true);
                    intent2.putExtra("album_show_source_type", 11);
                    com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment4 = (com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment) lk5.q0.a(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.class, intent2, false, false, false, com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment.class, 28, null);
                    mediaTabFragment4.R = true;
                    mediaTabFragment4.S = true;
                    mediaTabFragment2 = mediaTabFragment4;
                } else if (i19 != 4) {
                    mediaTabFragment2 = new com.tencent.mm.ui.vas.VASCommonFragment();
                } else {
                    rr1.a aVar = com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI.f94058i;
                    intent2.setClass(context, com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI.class);
                    com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment5 = (com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment) lk5.q0.a(com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI.class, intent2, false, false, false, com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment.class, 28, null);
                    mediaTabFragment5.R = true;
                    mediaTabFragment5.S = false;
                    mediaTabFragment = mediaTabFragment5;
                }
                mediaTabFragment = mediaTabFragment2;
            } else {
                intent2.putExtra("is_multi_tab_with_record", true);
                intent2.putExtra("key_check_permission_on_create", false);
                int i37 = com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI.f138612x2;
                com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment mediaTabFragment6 = (com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment) lk5.q0.a(com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI.class, intent2, false, false, false, com.tencent.mm.plugin.gallery.picker.tab.MediaTabFragment.class, 28, null);
                mediaTabFragment6.R = false;
                mediaTabFragment = mediaTabFragment6;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaPickerUIC", "index:" + i18 + " type:" + i19 + " fragment:" + mediaTabFragment);
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), mediaTabFragment));
            if (i18 == T6()) {
                this.f17678g = mediaTabFragment;
            }
            V6(i19, new b33.k(getIntent().getIntExtra("MediaOptScene", -1), i19 != 1 ? i19 != 2 ? i19 != 3 ? iy1.c.MainUI : iy1.c.MediaTabSnsAlbumUI : iy1.c.MediaTabCaptureUI : iy1.c.MediaTabAlbumUI));
            i17++;
            i18 = i27;
        }
        com.tencent.mm.ui.base.CustomViewPager U6 = U6();
        androidx.fragment.app.FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.tencent.mm.ui.vas.VASCommonFragment) ((jz5.l) it.next()).f302834e);
        }
        U6.setAdapter(new b33.q(supportFragmentManager, arrayList2));
        U6().setOffscreenPageLimit(intArrayExtra.length - 1);
        U6().addOnPageChangeListener(this);
        V6(intArrayExtra[T6()], new b33.n(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaPickerUIC", "onDestroy");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f17677f;
        jz5.l lVar = (jz5.l) arrayList.get(i17);
        if (lVar == null) {
            return;
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f17678g;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = (com.tencent.mm.ui.vas.VASCommonFragment) lVar.f302834e;
        this.f17678g = vASCommonFragment2;
        boolean b17 = kotlin.jvm.internal.o.b(vASCommonFragment2, vASCommonFragment);
        java.lang.Object obj2 = lVar.f302833d;
        if (!b17) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((jz5.l) obj).f302834e, vASCommonFragment)) {
                        break;
                    }
                }
            }
            jz5.l lVar2 = (jz5.l) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaPickerUIC", "onPageSelected:" + ((java.lang.Number) obj2).intValue() + " unselected:" + lVar2);
            V6(lVar2 != null ? ((java.lang.Number) lVar2.f302833d).intValue() : -1, new b33.l(this));
        }
        V6(((java.lang.Number) obj2).intValue(), new b33.m(this));
    }
}
