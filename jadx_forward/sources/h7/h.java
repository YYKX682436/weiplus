package h7;

/* loaded from: classes13.dex */
public class h extends f7.b {
    public h(h7.f fVar) {
        super(fVar);
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return h7.f.class;
    }

    @Override // w6.z0
    /* renamed from: getSize */
    public int mo14473xfb854877() {
        h7.m mVar = ((h7.f) this.f341557d).f360866d.f360865a;
        s6.f fVar = (s6.f) mVar.f360882a;
        return fVar.f484829d.limit() + fVar.f484834i.length + (fVar.f484835j.length * 4) + mVar.f360895n;
    }

    @Override // f7.b, w6.u0
    /* renamed from: initialize */
    public void mo123606x33ebcb90() {
        ((h7.f) this.f341557d).f360866d.f360865a.f360893l.prepareToDraw();
    }

    @Override // w6.z0
    /* renamed from: recycle */
    public void mo14474x408b7293() {
        x6.b bVar;
        x6.b bVar2;
        x6.b bVar3;
        h7.f fVar = (h7.f) this.f341557d;
        fVar.stop();
        fVar.f360869g = true;
        h7.m mVar = fVar.f360866d.f360865a;
        ((java.util.ArrayList) mVar.f360884c).clear();
        android.graphics.Bitmap bitmap = mVar.f360893l;
        if (bitmap != null) {
            mVar.f360886e.b(bitmap);
            mVar.f360893l = null;
        }
        mVar.f360887f = false;
        h7.j jVar = mVar.f360890i;
        com.p147xb1cd08cc.p148x5de23a5.r rVar = mVar.f360885d;
        if (jVar != null) {
            rVar.i(jVar);
            mVar.f360890i = null;
        }
        h7.j jVar2 = mVar.f360892k;
        if (jVar2 != null) {
            rVar.i(jVar2);
            mVar.f360892k = null;
        }
        h7.j jVar3 = mVar.f360894m;
        if (jVar3 != null) {
            rVar.i(jVar3);
            mVar.f360894m = null;
        }
        s6.f fVar2 = (s6.f) mVar.f360882a;
        fVar2.f484837l = null;
        byte[] bArr = fVar2.f484834i;
        s6.a aVar = fVar2.f484828c;
        if (bArr != null && (bVar3 = ((h7.d) aVar).f360864b) != null) {
            ((x6.l) bVar3).g(bArr);
        }
        int[] iArr = fVar2.f484835j;
        if (iArr != null && (bVar2 = ((h7.d) aVar).f360864b) != null) {
            ((x6.l) bVar2).g(iArr);
        }
        android.graphics.Bitmap bitmap2 = fVar2.f484838m;
        if (bitmap2 != null) {
            ((h7.d) aVar).f360863a.b(bitmap2);
        }
        fVar2.f484838m = null;
        fVar2.f484829d = null;
        fVar2.f484844s = null;
        byte[] bArr2 = fVar2.f484830e;
        if (bArr2 != null && (bVar = ((h7.d) aVar).f360864b) != null) {
            ((x6.l) bVar).g(bArr2);
        }
        mVar.f360891j = true;
    }
}
