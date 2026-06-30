package kn5;

/* loaded from: classes10.dex */
public final class e implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {
    public static final kn5.b E = new kn5.b(null);
    public boolean A;
    public int B;
    public boolean C;
    public kn5.c D;

    /* renamed from: d, reason: collision with root package name */
    public final kn5.a f391320d;

    /* renamed from: g, reason: collision with root package name */
    public int f391323g;

    /* renamed from: h, reason: collision with root package name */
    public int f391324h;

    /* renamed from: i, reason: collision with root package name */
    public int f391325i;

    /* renamed from: m, reason: collision with root package name */
    public final int f391326m;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f391328o;

    /* renamed from: q, reason: collision with root package name */
    public int f391330q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f391331r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f391332s;

    /* renamed from: t, reason: collision with root package name */
    public int f391333t;

    /* renamed from: u, reason: collision with root package name */
    public int f391334u;

    /* renamed from: v, reason: collision with root package name */
    public int f391335v;

    /* renamed from: w, reason: collision with root package name */
    public int f391336w;

    /* renamed from: x, reason: collision with root package name */
    public int f391337x;

    /* renamed from: y, reason: collision with root package name */
    public int f391338y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f391339z;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f391321e = new android.os.Handler();

    /* renamed from: f, reason: collision with root package name */
    public final kn5.d f391322f = new kn5.d(this);

    /* renamed from: n, reason: collision with root package name */
    public final kn5.i f391327n = kn5.i.f391342d;

    /* renamed from: p, reason: collision with root package name */
    public int f391329p = -1;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
    }

    public e(android.content.Context context, kn5.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f391320d = aVar;
        this.f391323g = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561411hr);
        this.f391326m = (int) ((((int) (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561406hm) * 2.5d)) / 1000) * 25);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f391332s) {
            yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        int action = event.getAction();
        android.graphics.Rect rect = kn5.f.f391340a;
        int a17 = kn5.f.a(view, event.getX(), event.getY());
        float y17 = event.getY();
        if (action == 1) {
            d();
            yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        if (action == 2) {
            if (this.f391323g > -1) {
                float f17 = this.f391335v;
                android.os.Handler handler = this.f391321e;
                int i17 = this.f391326m;
                kn5.d dVar = this.f391322f;
                if (y17 >= f17 && y17 <= this.f391336w) {
                    this.A = false;
                    if (!this.f391339z) {
                        this.f391339z = true;
                        handler.removeCallbacks(dVar);
                        handler.postDelayed(dVar, 25L);
                        if (!this.C) {
                            this.C = true;
                        }
                    }
                    this.B = i17;
                } else if (y17 >= this.f391337x && y17 <= this.f391338y) {
                    this.f391339z = false;
                    if (!this.A) {
                        this.A = true;
                        handler.removeCallbacks(dVar);
                        handler.postDelayed(dVar, 25L);
                        if (!this.C) {
                            this.C = true;
                        }
                    }
                    this.B = i17;
                } else if (this.f391339z || this.A) {
                    handler.removeCallbacks(dVar);
                    if (this.C) {
                        this.C = false;
                    }
                    this.f391339z = false;
                    this.A = false;
                }
            }
            e(a17);
            if (a17 != -1) {
                kn5.c cVar = this.D;
                if (cVar != null) {
                    cVar.f391317a = event.getX();
                    cVar.f391318b = event.getY();
                } else {
                    cVar = new kn5.c(event);
                }
                this.D = cVar;
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 view, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f391332s = false;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = view.mo7946xf939df19();
        boolean z17 = this.f391331r && !((mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) == 0);
        if (z17) {
            this.f391328o = view;
            view.getMeasuredHeight();
            int i17 = this.f391323g;
            if (i17 > -1) {
                this.f391335v = 0;
                this.f391336w = i17 + 0;
                this.f391337x = (view.getMeasuredHeight() - this.f391323g) - 0;
                int measuredHeight = view.getMeasuredHeight() - 0;
                this.f391338y = measuredHeight;
                int i18 = this.f391324h;
                if (i18 != 0) {
                    this.f391335v += i18;
                }
                int i19 = this.f391325i;
                if (i19 != 0) {
                    this.f391338y = measuredHeight + i19;
                }
            }
        }
        if (z17 && event.getAction() == 1) {
            d();
        }
        return z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }

    public final void d() {
        this.f391331r = false;
        this.f391339z = false;
        this.A = false;
        this.f391321e.removeCallbacks(this.f391322f);
        if (this.C) {
            this.C = false;
        }
        this.D = null;
    }

    public final void e(int i17) {
        int i18;
        int i19;
        java.lang.System.currentTimeMillis();
        kn5.i iVar = kn5.i.f391343e;
        kn5.a aVar = this.f391320d;
        kn5.i iVar2 = this.f391327n;
        if (iVar2 == iVar && i17 != -1) {
            if (this.f391329p == i17) {
                return;
            }
            this.f391329p = i17;
            aVar.a(i17, !aVar.c(i17));
            return;
        }
        if (iVar2 != kn5.i.f391342d || i17 == -1 || this.f391329p == i17) {
            return;
        }
        this.f391329p = i17;
        if (this.f391333t == -1) {
            this.f391333t = i17;
        }
        if (this.f391334u == -1) {
            this.f391334u = i17;
        }
        if (i17 > this.f391334u) {
            this.f391334u = i17;
        }
        if (i17 < this.f391333t) {
            this.f391333t = i17;
        }
        int i27 = this.f391330q;
        int i28 = this.f391333t;
        int i29 = this.f391334u;
        if (i27 == i17) {
            if (i28 <= i29) {
                while (true) {
                    if (i28 != i27) {
                        aVar.a(i28, false);
                    }
                    if (i28 == i29) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
        } else if (i17 < i27) {
            if (i17 <= i27) {
                int i37 = i27;
                while (true) {
                    aVar.a(i37, true);
                    if (i37 == i17) {
                        break;
                    } else {
                        i37--;
                    }
                }
            }
            if (i28 > -1 && i28 < i17) {
                while (i28 < i17) {
                    if (i28 != i27) {
                        aVar.a(i28, false);
                    }
                    i28++;
                }
            }
            if (i29 > -1 && (i19 = i27 + 1) <= i29) {
                while (true) {
                    aVar.a(i19, false);
                    if (i19 == i29) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        } else {
            if (i27 <= i17) {
                int i38 = i27;
                while (true) {
                    aVar.a(i38, true);
                    if (i38 == i17) {
                        break;
                    } else {
                        i38++;
                    }
                }
            }
            if (i29 > -1 && i29 > i17 && (i18 = i17 + 1) <= i29) {
                while (true) {
                    if (i18 != i27) {
                        aVar.a(i18, false);
                    }
                    if (i18 == i29) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            if (i28 > -1) {
                while (i28 < i27) {
                    aVar.a(i28, false);
                    i28++;
                }
            }
        }
        int i39 = this.f391330q;
        int i47 = this.f391329p;
        if (i39 == i47) {
            this.f391333t = i47;
            this.f391334u = i47;
        }
    }

    public final boolean f(boolean z17, int i17) {
        if (z17 && this.f391331r) {
            return false;
        }
        this.f391329p = -1;
        this.f391333t = -1;
        this.f391334u = -1;
        this.f391321e.removeCallbacks(this.f391322f);
        if (this.C) {
            this.C = false;
        }
        this.f391339z = false;
        this.A = false;
        if (!z17) {
            this.f391330q = -1;
            return false;
        }
        kn5.a aVar = this.f391320d;
        if (!aVar.b(i17)) {
            this.f391331r = false;
            this.f391330q = -1;
            return false;
        }
        aVar.a(i17, true);
        this.f391331r = z17;
        this.f391330q = i17;
        this.f391329p = i17;
        return true;
    }
}
