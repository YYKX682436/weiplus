package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI */
/* loaded from: classes11.dex */
public class ActivityC22359x66709fa8 extends com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f {

    /* renamed from: LAST_RESTORE_TALKER */
    private static final java.lang.String f39534x8bbf8613 = "last_restore_talker";
    static final java.lang.String TAG = "MicroMsg.BaseConversationUI";

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f288819d = 0;

    /* renamed from: _hellAccFlag_ */
    private byte f39535x7f11beae;

    /* renamed from: chattingFragmentView */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba f39536xb9e57e7b;

    /* renamed from: chattingFragmet */
    private com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f39537xc7dd9584;

    /* renamed from: chattingUIProxy */
    private com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab f39539x9a79d734;

    /* renamed from: chattingView */
    private com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 f39540xbb71960b;

    /* renamed from: conversationFm */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI f39542x9c18d0aa;

    /* renamed from: isAnimating */
    private boolean f39543x88e85d54;

    /* renamed from: lastRestoreTalker */
    private java.lang.String f39544x38b8e391;

    /* renamed from: mActionBar */
    private p012xc85e97e9.p016x746ad0e3.app.b f39546x86889c10;

    /* renamed from: mActionBarHelper */
    private com.p314xaae8f345.mm.ui.j f39547x9ba64bde;

    /* renamed from: mChattingInAnim */
    private android.view.animation.Animation f39549x961e4c89;

    /* renamed from: mChattingOutAnim */
    private android.view.animation.Animation f39550x79bce12c;

    /* renamed from: mPrepareBitmap */
    private android.graphics.Bitmap f39552x857fd1a9;

    /* renamed from: pendingBundle */
    android.os.Bundle f39555xfc16d8f9;

    /* renamed from: pendingUser */
    java.lang.String f39556x425c4602;

    /* renamed from: title */
    private java.lang.CharSequence f39559x6942258;

    /* renamed from: chattinguiResumeTime */
    private long f39541x29c3b394 = 0;

    /* renamed from: unreadSum */
    private int f39560xa66d801c = 0;

    /* renamed from: launcherUIStatus */
    private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0 f39545xf202f746 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_CREATE;

    /* renamed from: mNeedChattingAnim */
    private boolean f39551x933893ba = false;

    /* renamed from: mChattingClosed */
    public boolean f39548x8bda051f = true;

    /* renamed from: chattingID */
    private int f39538xd4c609e1 = -1;

    /* renamed from: onDrawStart */
    private long f39554x6408e5f = 0;

    /* renamed from: onChattingLayoutChangedListener */
    private db5.x8 f39553x545a7ab9 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v(this);

    /* renamed from: startChattingRunnable */
    java.lang.Runnable f39558x36f01005 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b0(this);

    /* renamed from: selectImageJob */
    private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f0 f39557x586157e = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f0(this, null);

    /* renamed from: access$100 */
    public static void m80456xbbd77eb1(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, android.content.Intent intent, boolean z17) {
        boolean z18;
        char c17;
        android.view.View view;
        int i17;
        activityC22359x66709fa8.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (activityC22359x66709fa8.f39537xc7dd9584 == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea mo80432x7473b9c0 = activityC22359x66709fa8.mo80432x7473b9c0();
            activityC22359x66709fa8.f39537xc7dd9584 = mo80432x7473b9c0;
            activityC22359x66709fa8.f39539x9a79d734 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21631x5f0c8f14(activityC22359x66709fa8, mo80432x7473b9c0);
            z18 = true;
        } else {
            z18 = false;
        }
        if (activityC22359x66709fa8.f39540xbb71960b == null) {
            if (activityC22359x66709fa8.f39537xc7dd9584.mo26090x345d1387()) {
                int[] iArr = new int[2];
                android.view.View j17 = activityC22359x66709fa8.mo2533x106ab264().j();
                if (j17 != null) {
                    j17.getLocationInWindow(iArr);
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10(activityC22359x66709fa8);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                c22559x35245a10.setId(com.p314xaae8f345.mm.R.id.bks);
                activityC22359x66709fa8.f39538xd4c609e1 = c22559x35245a10.getId();
                c22559x35245a10.setOrientation(1);
                c22559x35245a10.setLayoutParams(layoutParams);
                com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = new com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView(activityC22359x66709fa8);
                fitSystemWindowLayoutView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.view.View j18 = activityC22359x66709fa8.f39546x86889c10.j();
                if (j18 == null) {
                    view = null;
                } else {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView();
                    android.view.ViewParent viewParent = null;
                    for (android.view.ViewParent parent = j18.getParent(); parent != viewGroup && parent != null; parent = parent.getParent()) {
                        viewParent = parent;
                    }
                    view = (android.view.ViewGroup) viewParent;
                }
                if (view == null) {
                    view = ((android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView()).getChildAt(0);
                }
                android.view.View view2 = view;
                android.view.ViewGroup viewGroup2 = view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab ? (android.view.ViewGroup) ((android.view.ViewGroup) view2).getChildAt(0) : (android.view.ViewGroup) view2;
                android.widget.ImageView imageView = new android.widget.ImageView(activityC22359x66709fa8);
                imageView.setId(com.p314xaae8f345.mm.R.id.l3_);
                imageView.setLayoutParams(layoutParams);
                imageView.setVisibility(8);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activityC22359x66709fa8);
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                frameLayout.setId(com.p314xaae8f345.mm.R.id.f567019u90);
                frameLayout.setLayoutParams(layoutParams2);
                ((android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView()).removeView(view2);
                view2.setId(com.p314xaae8f345.mm.R.id.huh);
                frameLayout.addView(view2);
                frameLayout.addView(imageView);
                frameLayout.addView(c22559x35245a10);
                fitSystemWindowLayoutView.addView(frameLayout);
                ((android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView()).addView(fitSystemWindowLayoutView);
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activityC22359x66709fa8);
                if (Ai != null) {
                    i17 = 0;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).R6(frameLayout, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x(activityC22359x66709fa8), false);
                } else {
                    i17 = 0;
                }
                activityC22359x66709fa8.getWindow().getDecorView().requestFitSystemWindows();
                int i18 = iArr[1];
                if (i18 > 0) {
                    activityC22359x66709fa8.V6(fitSystemWindowLayoutView, i18, new android.graphics.Rect(i17, i18, i17, i17), viewGroup2);
                } else {
                    android.view.View j19 = activityC22359x66709fa8.mo2533x106ab264().j();
                    if (j19 != null) {
                        j19.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z(activityC22359x66709fa8, j19, iArr, fitSystemWindowLayoutView, viewGroup2));
                    }
                }
                activityC22359x66709fa8.f39540xbb71960b = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) activityC22359x66709fa8.findViewById(activityC22359x66709fa8.f39538xd4c609e1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ashu::prepareChattingFragment init chattingView, top %s", java.lang.Integer.valueOf(iArr[1]));
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) activityC22359x66709fa8.findViewById(com.p314xaae8f345.mm.R.id.bjy);
                activityC22359x66709fa8.f39540xbb71960b = c22559x35245a102;
                activityC22359x66709fa8.f39538xd4c609e1 = c22559x35245a102.getId();
            }
        } else if (activityC22359x66709fa8.f39537xc7dd9584.mo26090x345d1387()) {
            int[] iArr2 = new int[2];
            activityC22359x66709fa8.f39540xbb71960b.getLocationInWindow(iArr2);
            if (iArr2[1] == 0) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView();
                int i19 = 0;
                while (true) {
                    if (i19 >= viewGroup3.getChildCount()) {
                        break;
                    }
                    android.view.View childAt = ((android.view.ViewGroup) activityC22359x66709fa8.getWindow().getDecorView()).getChildAt(i19);
                    if (childAt instanceof com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView) {
                        if (activityC22359x66709fa8.mo2533x106ab264().j() != null) {
                            activityC22359x66709fa8.mo2533x106ab264().j().getLocationInWindow(iArr2);
                        }
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView2 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView) childAt;
                        fitSystemWindowLayoutView2.fitSystemWindows(new android.graphics.Rect(0, fitSystemWindowLayoutView2.m78430xdf3aaa13(), 0, 0));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "rootLayout2 fitSystemWindows, top %s", java.lang.Integer.valueOf(iArr2[1]));
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.huh);
                        android.widget.ImageView imageView2 = (android.widget.ImageView) fitSystemWindowLayoutView2.findViewById(com.p314xaae8f345.mm.R.id.l3_);
                        imageView2.setTag(viewGroup4);
                        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup4.getLayoutParams();
                        if (layoutParams3 == null || (layoutParams3 instanceof android.widget.FrameLayout.LayoutParams)) {
                            imageView2.setLayoutParams(layoutParams3);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "FIX LayoutParams");
                            imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutParams3));
                        }
                        if (!activityC22359x66709fa8.mo80481xdcc239dd() || android.os.Build.VERSION.SDK_INT < 26) {
                            android.graphics.Bitmap m80482xa4cd79b = activityC22359x66709fa8.m80482xa4cd79b(viewGroup4);
                            if (m80482xa4cd79b != null) {
                                imageView2.setImageBitmap(m80482xa4cd79b);
                                viewGroup4.setVisibility(8);
                                imageView2.setVisibility(0);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[prepareChattingFragment] prepareView VISIBLE");
                            } else {
                                imageView2.setImageBitmap(null);
                            }
                        } else {
                            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a0 a0Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a0(activityC22359x66709fa8, imageView2, viewGroup4);
                            int width = viewGroup4.getWidth();
                            int height = viewGroup4.getHeight();
                            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(config);
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(height));
                            arrayList.add(java.lang.Integer.valueOf(width));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCacheViaPixelCopy", "(Landroid/view/View;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCacheViaPixelCopy", "(Landroid/view/View;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                            activityC22359x66709fa8.f39552x857fd1a9 = createBitmap;
                            try {
                                android.view.PixelCopy.request(activityC22359x66709fa8.getWindow(), new android.graphics.Rect(viewGroup4.getLeft(), viewGroup4.getTop(), viewGroup4.getRight(), viewGroup4.getBottom()), activityC22359x66709fa8.f39552x857fd1a9, a0Var, new android.os.Handler(android.os.Looper.getMainLooper()));
                            } catch (java.lang.IllegalArgumentException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "PixelCopy failed: %s", e17);
                                a0Var.onPixelCopyFinished(1);
                                c17 = 1;
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "on position %d, rootLayout not found!", java.lang.Integer.valueOf(i19));
                        i19++;
                    }
                }
            }
            c17 = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ashu::prepareChattingFragment has chattingView, top %s", java.lang.Integer.valueOf(iArr2[c17]));
        }
        if (intent != null) {
            activityC22359x66709fa8.f39537xc7dd9584.m7436x8619eaa0().putAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(intent));
        }
        if (z18) {
            activityC22359x66709fa8.f39539x9a79d734.mo78437xc39adf8f(activityC22359x66709fa8.f39538xd4c609e1, z17);
            activityC22359x66709fa8.f39536xb9e57e7b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) activityC22359x66709fa8.f39537xc7dd9584.m7474xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.bkb);
        } else {
            activityC22359x66709fa8.f39539x9a79d734.mo78433x94b667f0();
        }
        if (activityC22359x66709fa8.f39537xc7dd9584.m78668x4e2d2008()) {
            activityC22359x66709fa8.f39537xc7dd9584.m78658x28280f95().m81454x4335bff3(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(z18), intent);
    }

    /* renamed from: access$1500 */
    public static void m80463xbf186a64(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        activityC22359x66709fa8.getClass();
        if (bitmap == null) {
            imageView.setImageBitmap(null);
            return;
        }
        imageView.setImageBitmap(bitmap);
        viewGroup.setVisibility(8);
        imageView.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[prepareChattingFragment] prepareView VISIBLE");
    }

    /* renamed from: access$500 */
    public static void m80471xbbd78db5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        if (activityC22359x66709fa8.f39549x961e4c89 == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC22359x66709fa8, com.p314xaae8f345.mm.ui.uc.f292611a);
            activityC22359x66709fa8.f39549x961e4c89 = loadAnimation;
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w(activityC22359x66709fa8));
        }
    }

    /* renamed from: access$800 */
    public static void m80476xbbd798f8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        activityC22359x66709fa8.f39540xbb71960b.setTranslationX(0.0f);
        activityC22359x66709fa8.f39540xbb71960b.e();
    }

    /* renamed from: access$900 */
    public static void m80477xbbd79cb9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        activityC22359x66709fa8.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t(activityC22359x66709fa8), 60L);
    }

    public final void S6() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea != null && c21628xcedb13ea.f279685f.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "[initActionBar] isChattingForeground True!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "[initActionBar] isChattingForeground False!");
        android.view.View m80480x2de08c5d = m80480x2de08c5d();
        this.f39547x9ba64bde = new com.p314xaae8f345.mm.ui.j(m80480x2de08c5d);
        this.f39546x86889c10.I(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent)));
        this.f39546x86889c10.F(false);
        this.f39546x86889c10.B(false);
        this.f39546x86889c10.E(false);
        this.f39546x86889c10.D(true);
        this.f39546x86889c10.y(m80480x2de08c5d);
        java.lang.CharSequence charSequence = this.f39559x6942258;
        com.p314xaae8f345.mm.ui.j jVar = this.f39547x9ba64bde;
        if (jVar != null) {
            jVar.g(charSequence);
        }
        this.f39547x9ba64bde.c(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r(this));
        if (this.f39546x86889c10.j() != null) {
            ((android.widget.TextView) this.f39546x86889c10.j().findViewById(com.p314xaae8f345.mm.R.id.obn)).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        }
    }

    public final void T6(boolean z17, int i17) {
        if (db5.f.g() && ep.a.a()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.huh);
            if (findViewById == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[onSettle] null == container");
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.l3_);
            if (imageView != null && imageView.getVisibility() == 8 && imageView.getDrawable() != null) {
                imageView.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSettle] prepareView VISIBLE");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/conversation/BaseConversationUI", "performOnSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView == null || imageView.getVisibility() != 0) {
                if (z17) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, i17 <= 0 ? 230L : 130L, 0.0f, 0.0f, null);
                    return;
                } else {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(findViewById, i17 <= 0 ? 230L : 130L, (findViewById.getWidth() * (-1)) / 2.5f, 0.0f, null);
                    return;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, i17 > 0 ? 130L : 230L, 0.0f, 0.0f, null);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(imageView, i17 > 0 ? 130L : 230L, (imageView.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    public final void U6() {
        if (db5.f.g() && ep.a.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f39537xc7dd9584 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
            if (c21628xcedb13ea == null || c21628xcedb13ea.m78658x28280f95() == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78658x28280f95 = this.f39537xc7dd9584.m78658x28280f95();
            m78658x28280f95.f292974v = false;
            m78658x28280f95.F = false;
        }
    }

    public final void V6(com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView, int i17, android.graphics.Rect rect, android.view.ViewGroup viewGroup) {
        int bottom = getWindow().getDecorView().getBottom();
        int i18 = 0;
        int bottom2 = mo2533x106ab264().j() != null ? mo2533x106ab264().j().getBottom() : 0;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = this.f39542x9c18d0aa;
        if (baseConversationFmUI != null && baseConversationFmUI.m7474xfb86a31b() != null) {
            i18 = bottom - ((i17 + bottom2) + this.f39542x9c18d0aa.m7474xfb86a31b().getBottom());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "ashu::fitSystemWindows 2. decorBottom:%d, statusBarHeight:%d, actionBarHeight:%d, paddingForNavBar:%d", java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bottom2), java.lang.Integer.valueOf(i18));
        fitSystemWindowLayoutView.m78431x6229eb06(viewGroup);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }

    /* renamed from: addPrepareChattingFragmentIdleHandler */
    public void m80478x8b6d533a() {
        if (db5.f.g() && ep.a.a()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
            if (c21628xcedb13ea != null && c21628xcedb13ea.m78668x4e2d2008()) {
                this.f39537xc7dd9584.m78658x28280f95().m81450x8e764904(true);
            }
            android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s(this));
        }
    }

    /* renamed from: closeChatting */
    public void m80479xa05a445e(boolean z17) {
        android.widget.ImageView imageView;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f39540xbb71960b;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 == null ? false : c22559x35245a10.isShown());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "try closeChatting, ishow:%b", objArr);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea != null && c21628xcedb13ea.m78668x4e2d2008()) {
            al5.a3.c(this);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102 = this.f39540xbb71960b;
        if (c22559x35245a102 == null || c22559x35245a102.getVisibility() == 8 || this.f39537xc7dd9584 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[closeChatting] needAnim:%s", java.lang.Boolean.valueOf(z17));
        this.f39540xbb71960b.setVisibility(8);
        this.f39548x8bda051f = true;
        if (z17 && this.f39550x79bce12c == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.ui.uc.f292614d);
            this.f39550x79bce12c = loadAnimation;
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c0(this));
        }
        if (this.f39537xc7dd9584.mo26090x345d1387() && (imageView = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_)) != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[closeChatting] prepareView GONE");
            if (imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z17) {
            this.f39539x9a79d734.mo78435xaae90f0c();
            this.f39539x9a79d734.mo78436x13e5bfe();
            this.f39540xbb71960b.startAnimation(this.f39550x79bce12c);
        } else {
            this.f39539x9a79d734.mo78435xaae90f0c();
            this.f39539x9a79d734.mo78436x13e5bfe();
            this.f39540xbb71960b.setVisibility(8);
            mo2326xb052149b(1.0f);
            U6();
        }
        if (!this.f39537xc7dd9584.mo26090x345d1387()) {
            S6();
        }
        mo2548x55429c53();
        m80485x4b04c3f6();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f39558x36f01005);
        }
        if (this.f39543x88e85d54) {
            return true;
        }
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).S6(keyEvent)) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea == null || !c21628xcedb13ea.mo78345x1f03f0c2(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    /* renamed from: getActionBarCustomView */
    public android.view.View m80480x2de08c5d() {
        return com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569441ba, (android.view.ViewGroup) null);
    }

    /* renamed from: getChattingUIFragment */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea mo80432x7473b9c0() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea();
    }

    /* renamed from: getMagicDrawingByPixelCopy */
    public boolean mo80481xdcc239dd() {
        return false;
    }

    /* renamed from: getMagicDrawingCache */
    public android.graphics.Bitmap m80482xa4cd79b(android.view.View view) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0) {
            width = view.getMeasuredWidth();
        }
        if (height <= 0) {
            height = view.getMeasuredHeight();
        }
        if (width <= 0 || height <= 0 || this.f39537xc7dd9584.m7474xfb86a31b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "viewWidth:%s viewHeight:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
            return null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getBottom:%s keyboardState:%s", java.lang.Integer.valueOf(c21628xcedb13ea.m7474xfb86a31b().getBottom()), java.lang.Integer.valueOf(this.f39537xc7dd9584.m78670x8200b8ea()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea2 = this.f39537xc7dd9584;
        if (c21628xcedb13ea2 != null && c21628xcedb13ea2.m7474xfb86a31b().getBottom() > 0 && (this.f39537xc7dd9584.m78670x8200b8ea() == 1 || this.f39537xc7dd9584.m7474xfb86a31b().getBottom() < (getResources().getDisplayMetrics().heightPixels * 2) / 3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hardKeyboardHidden:%s", java.lang.Integer.valueOf(this.f39537xc7dd9584.m78670x8200b8ea()));
            return null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea3 = this.f39537xc7dd9584;
        if (c21628xcedb13ea3 != null && c21628xcedb13ea3.m78670x8200b8ea() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hardKeyboardHidden:%s", java.lang.Integer.valueOf(this.f39537xc7dd9584.m78670x8200b8ea()));
            return null;
        }
        android.graphics.Bitmap bitmap = this.f39552x857fd1a9;
        if (bitmap == null || bitmap.isRecycled() || this.f39552x857fd1a9.getWidth() != width || this.f39552x857fd1a9.getHeight() != height) {
            android.graphics.Bitmap bitmap2 = this.f39552x857fd1a9;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "bitmap recycle %s", this.f39552x857fd1a9.toString());
                this.f39552x857fd1a9.recycle();
            }
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCache", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/conversation/BaseConversationUI", "getMagicDrawingCache", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                this.f39552x857fd1a9 = createBitmap;
            } catch (java.lang.OutOfMemoryError e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[getMagicDrawingCache] e:%s", e17);
                return null;
            }
        } else {
            this.f39552x857fd1a9.eraseColor(0);
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.f39552x857fd1a9);
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ael);
        int dimension2 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        canvas.drawRect(0.0f, dimension, width, height - dimension2, paint);
        view.draw(canvas);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[getMagicDrawingCache] cost%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return this.f39552x857fd1a9;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = this.f39542x9c18d0aa;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.mo7496x9d4787cb(i17, i18, intent);
        }
        if (i18 != -1) {
            return;
        }
        if ((i17 == 2001 || i17 == 226 || i17 == 229) && (c21628xcedb13ea = this.f39537xc7dd9584) != null) {
            c21628xcedb13ea.mo7496x9d4787cb(i17, i18, intent);
        }
        int i19 = 65535 & i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "check request code %d", java.lang.Integer.valueOf(i19));
        if ((i19 == 217 || i19 == 218) && this.f39537xc7dd9584 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on select image ActivityResult. the chattingUI maybe kill in the background.");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f39557x586157e);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f0 f0Var = this.f39557x586157e;
            f0Var.f289191d = 0;
            f0Var.f289192e = i17;
            f0Var.f289193f = i18;
            f0Var.f289194g = intent;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(f0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        getWindow().setFormat(-2);
        super.onCreate(bundle);
        getWindow().setCallback(new ma5.f(getWindow().getCallback(), this));
        this.f39546x86889c10 = mo2533x106ab264();
        mo52921x858d605d();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.graphics.Bitmap bitmap = this.f39552x857fd1a9;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "bitmap recycle %s", this.f39552x857fd1a9.toString());
            this.f39552x857fd1a9.recycle();
        }
        this.f39537xc7dd9584 = null;
        this.f39536xb9e57e7b = null;
        this.f39540xbb71960b = null;
        this.f39542x9c18d0aa = null;
        this.f39547x9ba64bde = null;
        this.f39549x961e4c89 = null;
        this.f39550x79bce12c = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onNewIntent");
        setIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "on pause");
        super.onPause();
        if (!isFinishing()) {
            al5.a3.d(this);
        }
        this.f39545xf202f746 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_PAUSE;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea == null || !c21628xcedb13ea.m78668x4e2d2008()) {
            return;
        }
        this.f39537xc7dd9584.m78658x28280f95().m81450x8e764904(false);
    }

    /* renamed from: onPrepareChattingFragmentEnd */
    public void mo80483x6dbaeafd() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f39544x38b8e391 = bundle.getString(f39534x8bbf8613);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        al5.a3.c(this);
        mo2326xb052149b(1.0f);
        this.f39545xf202f746 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_RESUME;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f39540xbb71960b;
        if (!(c22559x35245a10 != null && c22559x35245a10.isShown())) {
            this.f39541x29c3b394 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        if (!mo80489x12e3fe6e()) {
            m80478x8b6d533a();
        }
        S6();
        this.f39546x86889c10.L();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21628xcedb13ea.f279685f.x())) {
            return;
        }
        this.f39537xc7dd9584.f279685f.x();
        bundle.putString(f39534x8bbf8613, this.f39537xc7dd9584.f279685f.x());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: onSettle */
    public void mo2325x58f7e80a(boolean z17, int i17, boolean z18) {
        if (z18) {
            T6(z17, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: onSwipe */
    public void mo2326xb052149b(float f17) {
        android.widget.ImageView imageView;
        android.view.ViewGroup viewGroup;
        if (db5.f.g() && ep.a.a()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
            if (c21628xcedb13ea == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "chattingFragmet is null!");
                return;
            }
            if (f17 == 0.0f && !this.f39548x8bda051f) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_);
                if (imageView2 != null && (viewGroup = (android.view.ViewGroup) imageView2.getTag()) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSwipe] prepareView GONE");
                    viewGroup.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView2.setImageDrawable(null);
                }
                android.view.animation.Animation animation = this.f39549x961e4c89;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f17 == 1.0f && !this.f39548x8bda051f && c21628xcedb13ea.m78668x4e2d2008() && (imageView = (android.widget.ImageView) getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_)) != null && imageView.getVisibility() == 0 && imageView.getTag() != null) {
                android.view.View view = (android.view.View) imageView.getTag();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSwipe] prepareView GONE");
                imageView.setVisibility(8);
            }
            if (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_RESUME != this.f39545xf202f746 && java.lang.Float.compare(1.0f, f17) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSwipe] return! consumedSuperCall:%s", java.lang.Float.valueOf(f17));
                return;
            }
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.huh);
            android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.l3_);
            if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !this.f39548x8bda051f && f17 != 1.0f && f17 != 0.0f) {
                imageView3.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[onSwipe] !1 && !0 prepareView VISIBLE");
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (java.lang.Float.compare(1.0f, f17) <= 0) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, 0.0f, 0.0f);
                if (imageView3 == null || imageView3.getDrawable() == null) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, 0.0f, 0.0f);
                return;
            }
            if (imageView3 == null || imageView3.getDrawable() == null) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        android.view.ActionMode g17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
        if (c21628xcedb13ea == null || c21628xcedb13ea.A0() == null || !this.f39537xc7dd9584.mo26090x345d1387() || fp.h.b(22) || (g17 = this.f39537xc7dd9584.A0().A0.g(callback)) == null) {
            return null;
        }
        return g17;
    }

    /* renamed from: pauseMainFragment */
    public void m80484xa84bbc3f() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = this.f39542x9c18d0aa;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.mo7512xb01dfb57();
            if (this.f39542x9c18d0aa.m78668x4e2d2008()) {
                return;
            }
            this.f39542x9c18d0aa.m78710xb0dfae51(false);
        }
    }

    /* renamed from: resumeMainFragment */
    public void m80485x4b04c3f6() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = this.f39542x9c18d0aa;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.mo7517x57429eec();
            if (this.f39542x9c18d0aa.m78668x4e2d2008()) {
                return;
            }
            this.f39542x9c18d0aa.m78710xb0dfae51(true);
        }
    }

    /* renamed from: setCustomTitle */
    public void m80486x5a8dfa5(java.lang.CharSequence charSequence) {
        this.f39559x6942258 = charSequence;
        com.p314xaae8f345.mm.ui.j jVar = this.f39547x9ba64bde;
        if (jVar == null || jVar == null) {
            return;
        }
        jVar.g(charSequence);
    }

    /* renamed from: setTitle */
    public void m80487x53bfe316(java.lang.String str) {
        this.f39559x6942258 = str;
        if (this.f39547x9ba64bde != null) {
            m80495xdd320f0f(str);
        }
    }

    /* renamed from: setUnread */
    public void m80488x2636cab1(int i17, boolean z17) {
        this.f39560xa66d801c = i17;
        com.p314xaae8f345.mm.ui.j jVar = this.f39547x9ba64bde;
        if (jVar == null || !z17) {
            return;
        }
        jVar.h(i17);
    }

    /* renamed from: shouldSkipPrepareChattingOnIdle */
    public boolean mo80489x12e3fe6e() {
        return false;
    }

    /* renamed from: startChatting */
    public void m80490x5d4f20c8(java.lang.String str) {
        m80491x5d4f20c8(str, null, false);
    }

    /* renamed from: startChattingViewAnimation */
    public void m80493x77e6be77() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startChattingViewAnimation");
        if (this.f39549x961e4c89 == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.ui.uc.f292611a);
            this.f39549x961e4c89 = loadAnimation;
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w(this));
        }
        if (this.f39537xc7dd9584.m78658x28280f95() != null) {
            this.f39537xc7dd9584.m78658x28280f95().startAnimation(this.f39549x961e4c89);
        } else {
            this.f39537xc7dd9584.m7474xfb86a31b().startAnimation(this.f39549x961e4c89);
        }
    }

    /* renamed from: updateContentViewMargin */
    public void m80494xedaf7c43(android.view.View view) {
        if (view != null && mo60885x863d972f() && com.p314xaae8f345.mm.ui.b4.c(this)) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.jmc);
            view.setBackgroundColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            com.p314xaae8f345.mm.ui.a4.g(findViewById, true);
        }
    }

    /* renamed from: updateTitle */
    public void m80495xdd320f0f(java.lang.String str) {
        com.p314xaae8f345.mm.ui.j jVar = this.f39547x9ba64bde;
        if (jVar != null) {
            jVar.g(str);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$BaseConversationFmUI */
    /* loaded from: classes11.dex */
    public static class BaseConversationFmUI extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

        /* renamed from: fmStatus */
        private com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0 f39561x7df1d799 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_CREATE;

        /* renamed from: ui, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f288820ui;

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: finish */
        public void mo78641xb4098c93() {
            mo78409x676b27cd().finish();
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return 0;
        }

        /* renamed from: getUserName */
        public java.lang.String mo79363x6bf53a6c() {
            return null;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onCreateView */
        public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            this.f39561x7df1d799 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_CREATE;
            this.f288820ui = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8) mo78409x676b27cd();
            return super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            if (this.f39561x7df1d799 != com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_PAUSE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.TAG, "fmStatus != ActivityStatus.ACTIVITY_PAUSE when fm onDestroy");
                mo7512xb01dfb57();
            }
            super.mo7504xac79a11b();
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            super.mo7512xb01dfb57();
            this.f39561x7df1d799 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_PAUSE;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            super.mo7517x57429eec();
            this.f39561x7df1d799 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d0.ACTIVITY_RESUME;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: setMMTitle */
        public void mo78695xbf7c1df6(java.lang.String str) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f288820ui;
            if (activityC22359x66709fa8 != null) {
                activityC22359x66709fa8.m80487x53bfe316(str);
            }
        }

        /* renamed from: setUnread */
        public void m80497x2636cab1(int i17, boolean z17) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f288820ui;
            if (activityC22359x66709fa8 != null) {
                activityC22359x66709fa8.m80488x2636cab1(i17, z17);
            }
        }

        /* renamed from: setMMTitle */
        public void m80496xbf7c1df6(java.lang.CharSequence charSequence) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f288820ui;
            if (activityC22359x66709fa8 != null) {
                activityC22359x66709fa8.m80486x5a8dfa5(charSequence);
            }
        }
    }

    /* renamed from: startChatting */
    public void m80491x5d4f20c8(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        mo80492x5d4f20c8(str, bundle, z17, true);
    }

    /* renamed from: startChatting */
    public void mo80492x5d4f20c8(java.lang.String str, android.os.Bundle bundle, boolean z17, boolean z18) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = this.f39540xbb71960b;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 == null ? false : c22559x35245a10.isShown());
        objArr[1] = java.lang.Boolean.valueOf(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "try startChatting, ishow:%b, post: %b", objArr);
        this.f39555xfc16d8f9 = bundle;
        this.f39556x425c4602 = str;
        this.f39551x933893ba = z17;
        if (z17) {
            jz5.g gVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f39537xc7dd9584;
            if (c21628xcedb13ea != null) {
                c21628xcedb13ea.T0();
            }
        }
        if (z18) {
            gm0.j1.e().p();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-8);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f39558x36f01005);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f39558x36f01005);
            return;
        }
        this.f39558x36f01005.run();
    }
}
