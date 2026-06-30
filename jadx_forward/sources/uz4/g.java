package uz4;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f513711a;

    /* renamed from: b, reason: collision with root package name */
    public float f513712b;

    /* renamed from: c, reason: collision with root package name */
    public float f513713c;

    /* renamed from: d, reason: collision with root package name */
    public int f513714d;

    /* renamed from: e, reason: collision with root package name */
    public int f513715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 f513716f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705, uz4.e eVar) {
        this.f513716f = c19532x15431705;
    }

    public void b(int i17) {
        this.f513711a = false;
        float Y = o72.x1.Y(i17);
        this.f513712b = Y;
        this.f513713c = Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = this.f513716f;
        this.f513715e = i65.a.b(c19532x15431705.getContext(), 0);
        c19532x15431705.f269828g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c19532x15431705.getContext(), (int) (this.f513712b - this.f513713c)));
        c19532x15431705.f269829h.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c19532x15431705.getContext(), (int) this.f513712b));
        float f17 = this.f513712b;
        android.widget.TextView textView = c19532x15431705.f269829h;
        textView.setTag(com.p314xaae8f345.mm.R.id.nwn, textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9k, "" + (((int) f17) / 60), "" + (((int) f17) % 60)));
        c19532x15431705.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c19532x15431705.f269827f.setContentDescription(c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf) + c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_i));
        c19532x15431705.f269826e.setWidth(this.f513715e);
    }

    public void c() {
        float f17 = 1.0f - (this.f513713c / this.f513712b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = this.f513716f;
        int width = c19532x15431705.f269825d.getWidth();
        this.f513714d = ((int) (f17 * (width - r3))) + this.f513715e;
        c19532x15431705.f269828g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c19532x15431705.getContext(), (int) (this.f513712b - this.f513713c)));
        c19532x15431705.f269829h.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(c19532x15431705.getContext(), (int) this.f513712b));
        c19532x15431705.f269826e.setWidth(this.f513714d);
    }

    public void d(double d17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = this.f513716f;
        this.f513715e = i65.a.b(c19532x15431705.getContext(), 0);
        c19532x15431705.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c19532x15431705.f269827f.setContentDescription(c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf) + c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_i));
        c();
        if (z17) {
            c19532x15431705.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
            c19532x15431705.f269827f.setContentDescription(c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            mo50305x3d8a09a2(4096);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        this.f513713c = java.lang.Math.max(0.0f, this.f513713c - 0.256f);
        c();
        if (this.f513713c <= 0.1f) {
            return;
        }
        mo50307xb9e94560(4096, 256L);
    }
}
