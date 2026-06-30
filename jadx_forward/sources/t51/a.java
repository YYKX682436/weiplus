package t51;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final u51.a f497240a;

    public a(android.content.Context context, v51.d dVar) {
        u51.a aVar = new u51.a(1);
        this.f497240a = aVar;
        aVar.f506323k = context;
        aVar.f506313a = dVar;
    }

    public void a(w51.e eVar) {
        eVar.f524499g = this.f497240a;
        eVar.b();
        android.content.Context context = eVar.f524496d;
        eVar.f524502m = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559372cx);
        eVar.f524501i = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559373cy);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = new com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480(eVar.f524506q);
        eVar.f524499g.getClass();
        w51.i iVar = eVar.f524505p;
        if (iVar.f524513a == null) {
            iVar.f524513a = c11323x28056480;
        }
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x280564802 = iVar.f524513a;
        iVar.f524514b = c11323x280564802;
        u51.a aVar = eVar.f524499g;
        v51.c cVar = aVar.f506316d;
        if (cVar != null) {
            iVar.f524516d = cVar;
        }
        c11323x280564802.m48597x813dbbb(aVar.f506318f);
        android.graphics.Typeface typeface = eVar.f524499g.f506325m;
        android.view.ViewGroup viewGroup = eVar.f524498f;
        if (viewGroup != null) {
            viewGroup.findViewById(com.p314xaae8f345.mm.R.id.knb).setOnTouchListener(eVar.f524504o);
        }
        iVar.f524514b.m48598x4d90c14c(eVar.f524499g.f506324l);
        u51.a aVar2 = eVar.f524499g;
        s51.c cVar2 = aVar2.f506326n;
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x280564803 = iVar.f524514b;
        c11323x280564803.f153921p = false;
        int i17 = aVar2.f506327o;
        if (iVar.f524515c != null) {
            c11323x280564803.m48596x940d026a(i17);
        }
        iVar.f524514b.m48598x4d90c14c(eVar.f524499g.f506324l);
    }
}
