package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

/* loaded from: classes13.dex */
public class DanmuView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f83575d;

    /* renamed from: e, reason: collision with root package name */
    public int f83576e;

    /* renamed from: f, reason: collision with root package name */
    public int f83577f;

    /* renamed from: g, reason: collision with root package name */
    public int f83578g;

    /* renamed from: h, reason: collision with root package name */
    public float f83579h;

    /* renamed from: i, reason: collision with root package name */
    public float f83580i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83581m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83582n;

    /* renamed from: o, reason: collision with root package name */
    public we1.g f83583o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f83584p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Deque f83585q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f83586r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f83587s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f83588t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f83589u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f83590v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f83591w;

    /* renamed from: x, reason: collision with root package name */
    public long f83592x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f83593y;

    public DanmuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        this.f83584p = new java.util.HashMap(this.f83576e);
        for (int i17 = 0; i17 < this.f83576e; i17++) {
            this.f83584p.put(java.lang.Integer.valueOf(i17), new java.util.ArrayList(this.f83578g));
        }
        e();
    }

    public final void b() {
        java.util.HashMap hashMap = this.f83584p;
        if (hashMap != null && !hashMap.isEmpty()) {
            this.f83584p.clear();
        }
        synchronized (this.f83585q) {
            if (!this.f83585q.isEmpty()) {
                ((java.util.LinkedList) this.f83585q).clear();
            }
        }
    }

    public final int c(we1.h hVar) {
        int i17 = 0;
        while (true) {
            try {
                int i18 = this.f83576e;
                if (i17 >= i18) {
                    return -1;
                }
                int i19 = (i17 + 0) % i18;
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f83584p.get(java.lang.Integer.valueOf(i19));
                if (arrayList.size() == 0) {
                    return i19;
                }
                if (arrayList.size() <= this.f83578g) {
                    if (!((we1.a) hVar).b((we1.h) arrayList.get(arrayList.size() - 1))) {
                        return i19;
                    }
                }
                i17++;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.DanmuView", "findVacant,Exception:" + e17.getMessage());
                return -1;
            }
        }
    }

    public final double d() {
        this.f83590v.addLast(java.lang.Long.valueOf(java.lang.System.nanoTime()));
        double longValue = (r0 - ((java.lang.Long) this.f83590v.getFirst()).longValue()) / 1.0E9d;
        if (this.f83590v.size() > 100) {
            this.f83590v.removeFirst();
        }
        if (longValue > 0.0d) {
            return this.f83590v.size() / longValue;
        }
        return 0.0d;
    }

    public final void e() {
        this.f83587s = new int[this.f83576e];
        float b17 = i65.a.b(this.f83575d, 18) * 2.0f;
        float height = getHeight() * this.f83579h;
        int i17 = 0;
        int i18 = 0;
        while (i18 < this.f83576e) {
            int i19 = i18 + 1;
            this.f83587s[i18] = (int) (((i19 * b17) + height) - ((3.0f * b17) / 4.0f));
            i18 = i19;
        }
        if (this.f83582n) {
            this.f83593y.clear();
            this.f83593y.add(java.lang.Float.valueOf(height));
            while (i17 < this.f83576e) {
                i17++;
                this.f83593y.add(java.lang.Float.valueOf((i17 * b17) + height));
            }
        }
    }

    public void f() {
        float f17 = this.f83579h;
        float f18 = this.f83580i;
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
            this.f83589u = false;
            invalidate();
        }
    }

    public float getYOffset() {
        return this.f83580i - this.f83579h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.LinkedList linkedList;
        int c17;
        java.util.LinkedList linkedList2;
        super.onDraw(canvas);
        if (this.f83589u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DanmuView", "inTransition");
            return;
        }
        if (this.f83588t != 1) {
            if (this.f83588t == 2) {
                try {
                    canvas.drawColor(0);
                    for (int i17 = 0; i17 < this.f83584p.size(); i17++) {
                        java.util.Iterator it = ((java.util.ArrayList) this.f83584p.get(java.lang.Integer.valueOf(i17))).iterator();
                        while (it.hasNext()) {
                            ((we1.a) ((we1.h) it.next())).a(canvas, true);
                        }
                    }
                    if (this.f83581m && this.f83590v != null) {
                        canvas.drawText("FPS:" + ((int) d()), 5.0f, 20.0f, this.f83591w);
                    }
                    if (this.f83582n && (linkedList2 = this.f83593y) != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            float floatValue = ((java.lang.Float) it6.next()).floatValue();
                            canvas.drawLine(0.0f, floatValue, getWidth(), floatValue, this.f83591w);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", e17);
                }
                invalidate();
                return;
            }
            return;
        }
        try {
            canvas.drawColor(0);
            for (int i18 = 0; i18 < this.f83584p.size(); i18++) {
                java.util.Iterator it7 = ((java.util.ArrayList) this.f83584p.get(java.lang.Integer.valueOf(i18))).iterator();
                while (it7.hasNext()) {
                    we1.h hVar = (we1.h) it7.next();
                    we1.a aVar = (we1.a) hVar;
                    int i19 = aVar.f445196b;
                    if (i19 < 0 && java.lang.Math.abs(i19) > aVar.f445199e) {
                        it7.remove();
                    } else {
                        ((we1.a) hVar).a(canvas, false);
                    }
                }
            }
            if (java.lang.System.currentTimeMillis() - this.f83592x > this.f83577f) {
                this.f83592x = java.lang.System.currentTimeMillis();
                synchronized (this.f83585q) {
                    if (((java.util.LinkedList) this.f83585q).size() > 0) {
                        we1.h hVar2 = (we1.h) ((java.util.LinkedList) this.f83585q).getFirst();
                        int currPosSec = ((oe1.u) this.f83583o).f344742a.f83529f.getCurrPosSec();
                        while (hVar2 != null) {
                            if (!(currPosSec - ((we1.a) hVar2).f445202h > 10)) {
                                break;
                            }
                            ((java.util.LinkedList) this.f83585q).pollFirst();
                            hVar2 = (we1.h) ((java.util.LinkedList) this.f83585q).getFirst();
                        }
                        if (hVar2 != null) {
                            int i27 = ((we1.a) hVar2).f445202h;
                            if ((currPosSec >= i27 && currPosSec - i27 <= 10) && (c17 = c(hVar2)) >= 0) {
                                int width = canvas.getWidth() - 2;
                                int i28 = this.f83587s[c17];
                                we1.a aVar2 = (we1.a) hVar2;
                                aVar2.f445196b = width;
                                aVar2.f445197c = i28;
                                ((we1.a) hVar2).a(canvas, false);
                                ((java.util.ArrayList) this.f83584p.get(java.lang.Integer.valueOf(c17))).add(hVar2);
                                ((java.util.LinkedList) this.f83585q).pollFirst();
                            }
                        }
                    }
                }
            }
            if (this.f83581m && this.f83590v != null) {
                canvas.drawText("FPS:" + ((int) d()), 5.0f, 20.0f, this.f83591w);
            }
            if (this.f83582n && (linkedList = this.f83593y) != null) {
                java.util.Iterator it8 = linkedList.iterator();
                while (it8.hasNext()) {
                    float floatValue2 = ((java.lang.Float) it8.next()).floatValue();
                    canvas.drawLine(0.0f, floatValue2, getWidth(), floatValue2, this.f83591w);
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", e18);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        e();
    }

    public void setDanmuViewCallBack(we1.g gVar) {
        this.f83583o = gVar;
    }

    public void setMaxRow(int i17) {
        this.f83576e = i17;
        java.util.HashMap hashMap = this.f83584p;
        if (hashMap != null) {
            synchronized (hashMap) {
                for (int i18 = 0; i18 < this.f83584p.size(); i18++) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f83584p.get(java.lang.Integer.valueOf(i18));
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
            }
        }
        a();
    }

    public void setMaxRunningPerRow(int i17) {
        this.f83578g = i17;
    }

    public void setPickItemInterval(int i17) {
        this.f83577f = i17;
    }

    public void setShowFps(boolean z17) {
        this.f83581m = z17;
        if (z17) {
            if (this.f83591w == null || this.f83590v == null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(1);
                this.f83591w = textPaint;
                textPaint.setColor(-256);
                this.f83591w.setTextSize(20.0f);
                this.f83590v = new java.util.LinkedList();
            }
        }
    }

    public void setShowLines(boolean z17) {
        this.f83582n = z17;
        if (z17 && this.f83593y == null) {
            this.f83593y = new java.util.LinkedList();
        }
    }

    public DanmuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83576e = 5;
        this.f83577f = 500;
        this.f83578g = 10;
        this.f83579h = 0.0f;
        this.f83580i = 0.6f;
        this.f83581m = false;
        this.f83582n = false;
        this.f83585q = new java.util.LinkedList();
        this.f83586r = new java.util.LinkedList();
        this.f83588t = 3;
        this.f83592x = 0L;
        this.f83575d = context;
    }
}
