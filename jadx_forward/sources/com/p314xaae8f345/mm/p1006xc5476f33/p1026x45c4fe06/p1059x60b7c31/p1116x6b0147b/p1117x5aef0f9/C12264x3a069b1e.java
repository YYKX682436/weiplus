package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView */
/* loaded from: classes13.dex */
public class C12264x3a069b1e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165108d;

    /* renamed from: e, reason: collision with root package name */
    public int f165109e;

    /* renamed from: f, reason: collision with root package name */
    public int f165110f;

    /* renamed from: g, reason: collision with root package name */
    public int f165111g;

    /* renamed from: h, reason: collision with root package name */
    public float f165112h;

    /* renamed from: i, reason: collision with root package name */
    public float f165113i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165114m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f165115n;

    /* renamed from: o, reason: collision with root package name */
    public we1.g f165116o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f165117p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Deque f165118q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f165119r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f165120s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f165121t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f165122u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f165123v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f165124w;

    /* renamed from: x, reason: collision with root package name */
    public long f165125x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f165126y;

    public C12264x3a069b1e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        this.f165117p = new java.util.HashMap(this.f165109e);
        for (int i17 = 0; i17 < this.f165109e; i17++) {
            this.f165117p.put(java.lang.Integer.valueOf(i17), new java.util.ArrayList(this.f165111g));
        }
        e();
    }

    public final void b() {
        java.util.HashMap hashMap = this.f165117p;
        if (hashMap != null && !hashMap.isEmpty()) {
            this.f165117p.clear();
        }
        synchronized (this.f165118q) {
            if (!this.f165118q.isEmpty()) {
                ((java.util.LinkedList) this.f165118q).clear();
            }
        }
    }

    public final int c(we1.h hVar) {
        int i17 = 0;
        while (true) {
            try {
                int i18 = this.f165109e;
                if (i17 >= i18) {
                    return -1;
                }
                int i19 = (i17 + 0) % i18;
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f165117p.get(java.lang.Integer.valueOf(i19));
                if (arrayList.size() == 0) {
                    return i19;
                }
                if (arrayList.size() <= this.f165111g) {
                    if (!((we1.a) hVar).b((we1.h) arrayList.get(arrayList.size() - 1))) {
                        return i19;
                    }
                }
                i17++;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DanmuView", "findVacant,Exception:" + e17.getMessage());
                return -1;
            }
        }
    }

    public final double d() {
        this.f165123v.addLast(java.lang.Long.valueOf(java.lang.System.nanoTime()));
        double longValue = (r0 - ((java.lang.Long) this.f165123v.getFirst()).longValue()) / 1.0E9d;
        if (this.f165123v.size() > 100) {
            this.f165123v.removeFirst();
        }
        if (longValue > 0.0d) {
            return this.f165123v.size() / longValue;
        }
        return 0.0d;
    }

    public final void e() {
        this.f165120s = new int[this.f165109e];
        float b17 = i65.a.b(this.f165108d, 18) * 2.0f;
        float height = getHeight() * this.f165112h;
        int i17 = 0;
        int i18 = 0;
        while (i18 < this.f165109e) {
            int i19 = i18 + 1;
            this.f165120s[i18] = (int) (((i19 * b17) + height) - ((3.0f * b17) / 4.0f));
            i18 = i19;
        }
        if (this.f165115n) {
            this.f165126y.clear();
            this.f165126y.add(java.lang.Float.valueOf(height));
            while (i17 < this.f165109e) {
                i17++;
                this.f165126y.add(java.lang.Float.valueOf((i17 * b17) + height));
            }
        }
    }

    public void f() {
        float f17 = this.f165112h;
        float f18 = this.f165113i;
        if (f17 >= f18) {
            throw new java.lang.IllegalArgumentException("start_Y_offset must < end_Y_offset");
        }
        if (f17 < 0.0f || f17 >= 1.0f || f18 < 0.0f || f18 > 1.0f) {
            throw new java.lang.IllegalArgumentException("start_Y_offset and end_Y_offset must between 0 and 1)");
        }
        setBackgroundColor(0);
        setDrawingCacheBackgroundColor(0);
        a();
    }

    public final void g() {
        if (!(android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread())) {
            post(new we1.c(this));
        } else {
            this.f165122u = false;
            invalidate();
        }
    }

    /* renamed from: getYOffset */
    public float m51401xcb3b8e36() {
        return this.f165113i - this.f165112h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.LinkedList linkedList;
        int c17;
        java.util.LinkedList linkedList2;
        super.onDraw(canvas);
        if (this.f165122u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DanmuView", "inTransition");
            return;
        }
        if (this.f165121t != 1) {
            if (this.f165121t == 2) {
                try {
                    canvas.drawColor(0);
                    for (int i17 = 0; i17 < this.f165117p.size(); i17++) {
                        java.util.Iterator it = ((java.util.ArrayList) this.f165117p.get(java.lang.Integer.valueOf(i17))).iterator();
                        while (it.hasNext()) {
                            ((we1.a) ((we1.h) it.next())).a(canvas, true);
                        }
                    }
                    if (this.f165114m && this.f165123v != null) {
                        canvas.drawText("FPS:" + ((int) d()), 5.0f, 20.0f, this.f165124w);
                    }
                    if (this.f165115n && (linkedList2 = this.f165126y) != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            float floatValue = ((java.lang.Float) it6.next()).floatValue();
                            canvas.drawLine(0.0f, floatValue, getWidth(), floatValue, this.f165124w);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", e17);
                }
                invalidate();
                return;
            }
            return;
        }
        try {
            canvas.drawColor(0);
            for (int i18 = 0; i18 < this.f165117p.size(); i18++) {
                java.util.Iterator it7 = ((java.util.ArrayList) this.f165117p.get(java.lang.Integer.valueOf(i18))).iterator();
                while (it7.hasNext()) {
                    we1.h hVar = (we1.h) it7.next();
                    we1.a aVar = (we1.a) hVar;
                    int i19 = aVar.f526729b;
                    if (i19 < 0 && java.lang.Math.abs(i19) > aVar.f526732e) {
                        it7.remove();
                    } else {
                        ((we1.a) hVar).a(canvas, false);
                    }
                }
            }
            if (java.lang.System.currentTimeMillis() - this.f165125x > this.f165110f) {
                this.f165125x = java.lang.System.currentTimeMillis();
                synchronized (this.f165118q) {
                    if (((java.util.LinkedList) this.f165118q).size() > 0) {
                        we1.h hVar2 = (we1.h) ((java.util.LinkedList) this.f165118q).getFirst();
                        int mo51377x898ffe25 = ((oe1.u) this.f165116o).f426275a.f165062f.mo51377x898ffe25();
                        while (hVar2 != null) {
                            if (!(mo51377x898ffe25 - ((we1.a) hVar2).f526735h > 10)) {
                                break;
                            }
                            ((java.util.LinkedList) this.f165118q).pollFirst();
                            hVar2 = (we1.h) ((java.util.LinkedList) this.f165118q).getFirst();
                        }
                        if (hVar2 != null) {
                            int i27 = ((we1.a) hVar2).f526735h;
                            if ((mo51377x898ffe25 >= i27 && mo51377x898ffe25 - i27 <= 10) && (c17 = c(hVar2)) >= 0) {
                                int width = canvas.getWidth() - 2;
                                int i28 = this.f165120s[c17];
                                we1.a aVar2 = (we1.a) hVar2;
                                aVar2.f526729b = width;
                                aVar2.f526730c = i28;
                                ((we1.a) hVar2).a(canvas, false);
                                ((java.util.ArrayList) this.f165117p.get(java.lang.Integer.valueOf(c17))).add(hVar2);
                                ((java.util.LinkedList) this.f165118q).pollFirst();
                            }
                        }
                    }
                }
            }
            if (this.f165114m && this.f165123v != null) {
                canvas.drawText("FPS:" + ((int) d()), 5.0f, 20.0f, this.f165124w);
            }
            if (this.f165115n && (linkedList = this.f165126y) != null) {
                java.util.Iterator it8 = linkedList.iterator();
                while (it8.hasNext()) {
                    float floatValue2 = ((java.lang.Float) it8.next()).floatValue();
                    canvas.drawLine(0.0f, floatValue2, getWidth(), floatValue2, this.f165124w);
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", e18);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        e();
    }

    /* renamed from: setDanmuViewCallBack */
    public void m51402xe0cee981(we1.g gVar) {
        this.f165116o = gVar;
    }

    /* renamed from: setMaxRow */
    public void m51403x17db48d8(int i17) {
        this.f165109e = i17;
        java.util.HashMap hashMap = this.f165117p;
        if (hashMap != null) {
            synchronized (hashMap) {
                for (int i18 = 0; i18 < this.f165117p.size(); i18++) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f165117p.get(java.lang.Integer.valueOf(i18));
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
            }
        }
        a();
    }

    /* renamed from: setMaxRunningPerRow */
    public void m51404x68c2ff9a(int i17) {
        this.f165111g = i17;
    }

    /* renamed from: setPickItemInterval */
    public void m51405x316da83b(int i17) {
        this.f165110f = i17;
    }

    /* renamed from: setShowFps */
    public void m51406x2c7685ea(boolean z17) {
        this.f165114m = z17;
        if (z17) {
            if (this.f165124w == null || this.f165123v == null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                this.f165124w = textPaint;
                textPaint.setColor(-256);
                this.f165124w.setTextSize(20.0f);
                this.f165123v = new java.util.LinkedList();
            }
        }
    }

    /* renamed from: setShowLines */
    public void m51407xe93e0bc0(boolean z17) {
        this.f165115n = z17;
        if (z17 && this.f165126y == null) {
            this.f165126y = new java.util.LinkedList();
        }
    }

    public C12264x3a069b1e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165109e = 5;
        this.f165110f = 500;
        this.f165111g = 10;
        this.f165112h = 0.0f;
        this.f165113i = 0.6f;
        this.f165114m = false;
        this.f165115n = false;
        this.f165118q = new java.util.LinkedList();
        this.f165119r = new java.util.LinkedList();
        this.f165121t = 3;
        this.f165125x = 0L;
        this.f165108d = context;
    }
}
